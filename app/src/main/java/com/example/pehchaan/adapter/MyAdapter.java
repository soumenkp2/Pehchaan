package com.example.pehchaan.adapter;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pehchaan.databinding.CustomItemBinding;
import com.example.pehchaan.viewholder.MyViewHolder;
import com.example.pehchaan.R;
import com.example.pehchaan.fragment.DetailsFragment;
import com.example.pehchaan.model.Model;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {


    public ArrayList<Model> data;
    public Context context;


    public MyAdapter(ArrayList<Model> data, Context context) {
        this.data = data;
        this.context = context;

    }

    public MyAdapter() {

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CustomItemBinding binding = CustomItemBinding.inflate(LayoutInflater.from(context), parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //final model temp = data.get(position);

        holder.binding.itemtext.setText(data.get(position).getTxt());
        holder.binding.itemcircleimage.setImageResource(data.get(position).getImagename());
        holder.binding.itemphone.setText(data.get(position).getNumber());
        holder.binding.itemcall.setImageResource(data.get(position).getCall());
        holder.binding.itemmessage.setImageResource(data.get(position).getMessage());

        holder.binding.itemtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Model temp = data.get(position);
                Intent i = new Intent(context, DetailsFragment.class);

                i.putExtra("imagename", temp.getImagename());
                i.putExtra("name", temp.getTxt());
                i.putExtra("number", temp.getNumber());
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        });


        holder.binding.itemcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Model temp = data.get(position);
                Intent i = new Intent(Intent.ACTION_CALL);
                String s = "tel:" + temp.getNumber();

                i.setData(Uri.parse(s));

                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);

            }
        });

        holder.binding.itemmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Model temp = data.get(position);

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("smsto:"));
                i.setType("vnd.android-dir/mms-sms");
                i.putExtra("address", temp.getNumber());
                //sms1.putExtra("sms_body", "Your known person is in emergency , We Phechaan is sending you his/her emergency message ahead.\n" + message);

                try {
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(i);
                    //startActivity(i);
                    //Toast.makeText(context,"sent sucessfully!",Toast.LENGTH_SHORT).show();
                } catch (android.content.ActivityNotFoundException ex) {

                    Toast.makeText(context, "oops! failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}





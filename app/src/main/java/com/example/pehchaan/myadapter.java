package com.example.pehchaan;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<myviewholder> {


    public ArrayList<model> data;
    public Context context;


    public myadapter(ArrayList<model> data, Context context) {
        this.data = data;
        this.context = context;

    }

    public myadapter() {

    }




    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflator = LayoutInflater.from(parent.getContext());
        View v = inflator.inflate(R.layout.custom_item, parent, false);
        return new myviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        //final model temp = data.get(position);

        holder.text.setText(data.get(position).getTxt());
        holder.image.setImageResource(data.get(position).getImagename());
        holder.number.setText(data.get(position).getNumber());
        holder.call.setImageResource(data.get(position).getCall());
        holder.msg.setImageResource(data.get(position).getMessage());


        holder.text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final model temp = data.get(position);
                Intent i = new Intent(context, details.class);

                i.putExtra("imagename",temp.getImagename() );
                i.putExtra("name", temp.getTxt());
                i.putExtra("number", temp.getNumber());
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);



            }
        });



        holder.call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final model temp = data.get(position);
                Intent i = new Intent(Intent.ACTION_CALL);
                String s = "tel:" + temp.getNumber() ;

                i.setData(Uri.parse(s));

                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);



            }
        });

        holder.msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final model temp = data.get(position);

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("smsto:"));
                i.setType("vnd.android-dir/mms-sms");
                i.putExtra("address", temp.getNumber());
                //sms1.putExtra("sms_body", "Your known person is in emergency , We Phechaan is sending you his/her emergency message ahead.\n" + message);

                try
                {
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(i);
                    //startActivity(i);
                    //Toast.makeText(context,"sent sucessfully!",Toast.LENGTH_SHORT).show();
                }
                catch (android.content.ActivityNotFoundException ex)
                {

                    Toast.makeText(context,"oops! failed",Toast.LENGTH_SHORT).show();
                }






            }
        });





    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}





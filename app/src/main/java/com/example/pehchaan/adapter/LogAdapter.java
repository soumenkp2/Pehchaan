package com.example.pehchaan.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pehchaan.R;
import com.example.pehchaan.databinding.CustomItemBinding;
import com.example.pehchaan.databinding.LogItemBinding;
import com.example.pehchaan.viewholder.LogHolder;
import com.example.pehchaan.model.LogModel;
import com.example.pehchaan.viewholder.MyViewHolder;

import java.util.ArrayList;

public class LogAdapter extends RecyclerView.Adapter<LogHolder> {


    public ArrayList<LogModel> data;
    public Context context;
    // public ArrayList<log_model> backup;


    public LogAdapter(ArrayList<LogModel> data, Context context) {
        this.data = data;
        this.context = context;
        //backup = new ArrayList<>(data);

    }

    @NonNull
    @Override
    public LogHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LogItemBinding binding = LogItemBinding.inflate(LayoutInflater.from(context), parent, false);
        return new LogHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull LogHolder holder, int position) {

        holder.binding.nameLogs.setText(data.get(position).getName());
        holder.binding.numberLogs.setText(data.get(position).getNumbercl());
        holder.binding.dateLogs.setText(data.get(position).getDate());
        holder.binding.dateLogs.setText(data.get(position).getDuration());
        holder.binding.callLogs.setImageResource(data.get(position).getCallcl());
        holder.binding.typeLogs.setImageResource(data.get(position).getType());
        holder.binding.imageLogs.setImageResource(data.get(position).getImagename());

        holder.binding.callLogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final LogModel temp = data.get(position);
                Intent i = new Intent(Intent.ACTION_CALL);
                String s = "tel:" + temp.getNumbercl();

                i.setData(Uri.parse(s));

                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);


            }
        });


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

   /* @Override
    public Filter getFilter() {
        return filter;
    }

    Filter filter=new Filter() {
        @Override
        // background thread
        protected FilterResults performFiltering(CharSequence keyword)
        {
            ArrayList<log_model> filtereddata=new ArrayList<>();

            if(keyword.toString().isEmpty())
                filtereddata.addAll(backup);
            else
            {
                for(log_model obj : backup)
                {
                    if(obj.getName().toString().toLowerCase().contains(keyword.toString().toLowerCase()))
                        filtereddata.add(obj);
                }
            }

            FilterResults results=new FilterResults();
            results.values=filtereddata;
            return results;
        }

        @Override  // main UI thread
        protected void publishResults(CharSequence constraint, FilterResults results)
        {
            data.clear();
            data.addAll((ArrayList<log_model>)results.values);
            notifyDataSetChanged();
        }
    };*/


}

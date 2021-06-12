package com.example.pehchaan;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class logadapter extends  RecyclerView.Adapter<logholder> {


    public ArrayList<log_model> data;
    public Context context;
   // public ArrayList<log_model> backup;


    public logadapter(ArrayList<log_model> data, Context context) {
        this.data = data;
        this.context = context;
        //backup = new ArrayList<>(data);

    }

    @NonNull
    @Override
    public logholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflator = LayoutInflater.from(parent.getContext());
        View v = inflator.inflate(R.layout.log_item, parent, false);
        return new logholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull logholder holder, int position) {

        holder.name.setText(data.get(position).getName());
        holder.number.setText(data.get(position).getNumbercl());
        holder.date.setText(data.get(position).getDate());
        holder.duration.setText(data.get(position).getDuration());
        holder.call.setImageResource(data.get(position).getCallcl());
        holder.type.setImageResource(data.get(position).getType());
        holder.imgname.setImageResource(data.get(position).getImagename());

        holder.call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final log_model temp = data.get(position);
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

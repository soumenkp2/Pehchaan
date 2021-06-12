package com.example.pehchaan;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class logholder extends RecyclerView.ViewHolder {

    ImageView call;
    TextView name;
    TextView number;
    TextView date;
    TextView duration;
    ImageView type;
    ImageView imgname;



    public logholder(@NonNull View itemView) {
        super(itemView);

        call = (ImageView)itemView.findViewById(R.id.call_logs);
        name = (TextView)itemView.findViewById(R.id.name_logs);
        number = (TextView)itemView.findViewById(R.id.number_logs);
        date = (TextView) itemView.findViewById(R.id.date_logs);
        duration = (TextView) itemView.findViewById(R.id.time_logs);
        type = (ImageView)itemView.findViewById(R.id.type_logs);
        imgname = (ImageView)itemView.findViewById(R.id.image_logs);

    }
}
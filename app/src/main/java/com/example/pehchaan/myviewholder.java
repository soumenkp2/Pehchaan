package com.example.pehchaan;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//Linking the views of item layout xml
public class myviewholder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView text;
    TextView number;
    ImageView call;
    ImageView msg;
    TextView divide;



    public myviewholder(@NonNull View itemView) {
        super(itemView);
        image = (ImageView)itemView.findViewById(R.id.itemcircleimage);
        text = (TextView)itemView.findViewById(R.id.itemtext);
        number = (TextView)itemView.findViewById(R.id.itemphone);
        call = (ImageView) itemView.findViewById(R.id.itemcall);
        msg = (ImageView) itemView.findViewById(R.id.itemmessage);
        divide = (TextView)itemView.findViewById(R.id.itemdivider);


    }
}


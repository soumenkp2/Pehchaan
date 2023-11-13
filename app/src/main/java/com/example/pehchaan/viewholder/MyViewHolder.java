package com.example.pehchaan.viewholder;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pehchaan.R;
import com.example.pehchaan.databinding.CustomItemBinding;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public CustomItemBinding binding;

    public MyViewHolder(@NonNull CustomItemBinding itemView) {
        super(itemView.getRoot());
        binding = itemView;
    }
}


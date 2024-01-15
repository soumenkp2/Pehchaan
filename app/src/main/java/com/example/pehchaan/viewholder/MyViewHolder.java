package com.example.pehchaan.viewholder;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pehchaan.R;
import com.example.pehchaan.databinding.CustomItemBinding;
import com.example.pehchaan.model.Model;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public CustomItemBinding binding;

    public MyViewHolder(@NonNull CustomItemBinding itemView) {
        super(itemView.getRoot());
        binding = itemView;
    }

    public void bind(Model model) {
        binding.itemtext.setText(model.getTxt());
        binding.itemcircleimage.setImageResource(model.getImagename());
        binding.itemphone.setText(model.getNumber());
        binding.itemcall.setImageResource(model.getCall());
        binding.itemmessage.setImageResource(model.getMessage());
    }

}


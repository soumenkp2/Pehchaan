package com.example.pehchaan.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pehchaan.R;
import com.example.pehchaan.databinding.CustomItemBinding;
import com.example.pehchaan.databinding.LogItemBinding;

public class LogHolder extends RecyclerView.ViewHolder {

    public LogItemBinding binding;

    public LogHolder(@NonNull LogItemBinding itemView) {
        super(itemView.getRoot());
        binding = itemView;

    }
}
package com.example.android1_hw3recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MainViewHolder extends RecyclerView.ViewHolder {
        TextView myText1, myText2;
        ImageView myImage;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        myText1=itemView.findViewById(R.id.myText1);
        myText2=itemView.findViewById(R.id.myText2);
        myImage=itemView.findViewById(R.id.imageView);
    }
    public void onBind(ItemModel data1) {
        myText1.setText(data1.title);
        myText2.setText(data1.desc);
        myImage.setImageResource(data1.images);
    }
}

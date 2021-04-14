package com.example.android1_hw3recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MainViewHolder> {
    ArrayList<ItemModel> data1 = new ArrayList<>();

    // public MyAdapter(Context ct, ArrayList<String> s1, ArrayList<String> s2, int img[]) {

    // context = ct;
    //data1 = s1;
    //   data2 = s2;
    //     images = img;
    //  }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MainViewHolder(view);

    }

    public void addText(ArrayList<ItemModel> list) {
        data1 = list;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(data1.get(position));

    }

    @Override
    public int getItemCount() {
        return data1.size();
    }


}

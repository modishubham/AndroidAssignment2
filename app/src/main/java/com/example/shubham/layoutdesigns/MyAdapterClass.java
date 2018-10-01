package com.example.shubham.layoutdesigns;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;

public class MyAdapterClass extends RecyclerView.Adapter<MyAdapterClass.MyViewHolder> {
    private ArrayList<Model> news;
    public MyAdapterClass(ArrayList<Model> list) {
        news=list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        // model class ka object layega jo ki position specific hoga
        Model object = (Model)news.get(i);
        myViewHolder.title.setText(object.getTitle());
        myViewHolder.description.setText(object.getDesciption());
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title,description;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.textVie1);
            description=itemView.findViewById(R.id.textVie2);
        }
    }

}

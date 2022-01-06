package com.example.mytext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class rowadapter extends RecyclerView.Adapter<rowadapter.ViewHolder> {
Context context;
List<holddata> hospitalList;

    public rowadapter(Context context, List<holddata> hospitalList) {
        this.context = context;
        this.hospitalList = hospitalList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_design,parent,false);

        return new ViewHolder(v);

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holddata dataholder1=hospitalList.get(position);

        holder.name.setText("Name:- "+dataholder1.getName()+"    "+"Type:- "+dataholder1.getType());
        holder.details.setText("details"+dataholder1.getType());
       String imageuri=null;
       imageuri=dataholder1.getImage();
        Picasso.get().load(imageuri).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return hospitalList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name,details;
        public ViewHolder(View v) {
            super(v);
            imageView=v.findViewById(R.id.imageview);
            name=v.findViewById(R.id.tvname);
            details=v.findViewById(R.id.tvdetails);
        }
    }

}

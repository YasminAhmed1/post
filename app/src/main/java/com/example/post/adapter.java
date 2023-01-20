package com.example.post;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.postviewholder>{

    ArrayList<postdata> data;//null

    public adapter(ArrayList<postdata> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public postviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.post_item, parent, false);
        return new postviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull postviewholder holder, int position) {
        holder.title.setText(data.get(position).getTitle());
        holder.description.setText(data.get(position).getDescription());
        holder.date.setText(data.get(position).getDescription());
        holder.like.setText(data.get(position).getDescription());
        holder.comment.setText(data.get(position).getDescription());
        holder.share.setText(data.get(position).getDescription());
        holder.icon.setImageResource(data.get(position).getIcon());
        holder.image_post.setImageResource(data.get(position).getPost_image());
        holder.more.setImageResource(data.get(position).getMoree());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class postviewholder extends RecyclerView.ViewHolder{

             TextView title,date,description;
             ImageView icon,more,image_post;
             Button like, comment,share;
        public postviewholder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            date=itemView.findViewById(R.id.date);
            description=itemView.findViewById(R.id.description);
            like=itemView.findViewById(R.id.like);
            comment=itemView.findViewById(R.id.comment);
            share=itemView.findViewById(R.id.share);
            icon=itemView.findViewById(R.id.icon);
            more=itemView.findViewById(R.id.more);
            image_post=itemView.findViewById(R.id.image_post);

        }
    }
}

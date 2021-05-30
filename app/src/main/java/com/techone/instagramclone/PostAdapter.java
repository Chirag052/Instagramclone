package com.techone.instagramclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    Context context;
    ArrayList<PostModel> data=new ArrayList<>();

    public PostAdapter(Context context, ArrayList<PostModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater myInflater=LayoutInflater.from(context);
        View myownview =myInflater.inflate(R.layout.post_recycler_bin,parent,false);
        return new PostAdapter.PostViewHolder(myownview);

    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
            holder.userName.setText(data.get(position).getUsername());
            holder.caption.setText(data.get(position).getCaption());
            holder.userNameincaptions.setText(data.get(position).getUsername());
            holder.likes.setText(data.get(position).getLikes());
            holder.profileDP.setImageResource(data.get(position).getProfileDP());
            holder.profileDP_belowcomment.setImageResource(data.get(position).getProfileDP());
            holder.post.setImageResource(data.get(position).getPost());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        ImageView profileDP,profileDP_belowcomment,post;
        TextView userName,likes,userNameincaptions,caption;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.userName);
            likes =itemView.findViewById(R.id.likes);
            userNameincaptions = itemView.findViewById(R.id.userNameincaptions);
            caption = itemView.findViewById(R.id.caption);
            profileDP = itemView.findViewById(R.id.profileDP);
            profileDP_belowcomment = itemView.findViewById(R.id.profileDP_belowcomment);
            post = itemView.findViewById(R.id.post);
        }
    }
}

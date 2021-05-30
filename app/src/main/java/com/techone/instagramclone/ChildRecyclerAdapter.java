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

public class ChildRecyclerAdapter extends RecyclerView.Adapter<ChildRecyclerAdapter.ChildViewHolder> {
    ArrayList<SectionItems> sectionItems;
    Context ctx;

    public ChildRecyclerAdapter(Context ctx, ArrayList<SectionItems> sectionItems) {
        this.sectionItems = sectionItems;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ChildViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(ctx);
        View view = layoutInflater.inflate(R.layout.itemrow,parent,false);
        return new ChildRecyclerAdapter.ChildViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildViewHolder holder, int position) {
        holder.profileImage.setImageResource(sectionItems.get(position).getImageId());
        holder.itemRowTextView.setText(sectionItems.get(position).getItemName());
        holder.myProfileImage.setImageResource(sectionItems.get(position).getMyImageid());
    }

    @Override
    public int getItemCount() {
        return sectionItems.size();
    }

    public class ChildViewHolder extends RecyclerView.ViewHolder {

        ImageView profileImage;
        TextView itemRowTextView;
        ImageView myProfileImage;
        public ChildViewHolder(@NonNull View itemView) {
            super(itemView);
            itemRowTextView = itemView.findViewById(R.id.itemTextView);
            profileImage = itemView.findViewById(R.id.profile_photo);
            myProfileImage=itemView.findViewById(R.id.my_profile_photo);
        }
    }
}

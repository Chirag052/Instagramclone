package com.techone.instagramclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyPhotosAdapter extends RecyclerView.Adapter<MyPhotosAdapter.MyPhotosHolder> {

    Context context;
    ArrayList<MyPhotosModel> data=new ArrayList<>();

    public MyPhotosAdapter(Context context, ArrayList<MyPhotosModel> data) {
        this.context = context;
        this.data = data;
    }


    @NonNull
    @Override
    public MyPhotosHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater myInflater=LayoutInflater.from(context);
        View myownview =myInflater.inflate(R.layout.my_all_photos_recycler_view,parent,false);
        return new MyPhotosAdapter.MyPhotosHolder(myownview);
    }

    @Override
    public void onBindViewHolder(@NonNull MyPhotosHolder holder, int position) {
        holder.profileId.setImageResource(data.get(position).photoId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyPhotosHolder extends RecyclerView.ViewHolder {
        ImageView profileId;
        public MyPhotosHolder(@NonNull View itemView) {
            super(itemView);
            profileId = itemView.findViewById(R.id.myPhoto);
        }
    }
}

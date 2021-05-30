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

public class StatusBarAdapter extends RecyclerView.Adapter<StatusBarAdapter.StatusBarHolder> {
    Context context;
    ArrayList<StatusBarModel> data=new ArrayList<>();

    public StatusBarAdapter(Context context, ArrayList<StatusBarModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public StatusBarHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater myInflater=LayoutInflater.from(context);
        View myownview =myInflater.inflate(R.layout.statusbar_recycle_bin,parent,false);
        return new StatusBarAdapter.StatusBarHolder(myownview);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusBarHolder holder, int position) {
        holder.profileName.setText(data.get(position).getProfileName());
        holder.profileId.setImageResource(data.get(position).getProfileId());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class StatusBarHolder extends RecyclerView.ViewHolder {
        TextView profileName;
        ImageView profileId;
        public StatusBarHolder(@NonNull View itemView) {
            super(itemView);
            profileName=itemView.findViewById(R.id.idname);
            profileId=itemView.findViewById(R.id.profile_photo);
        }
    }
}

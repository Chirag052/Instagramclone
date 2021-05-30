package com.techone.instagramclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainRecyclerAdapter extends RecyclerView.Adapter<MainRecyclerAdapter.MainViewHolder> {

    ArrayList<Section> sectionList;
    Context ctx;

    public MainRecyclerAdapter(Context context, ArrayList<Section> sectionList) {
        this.sectionList = sectionList;
        this.ctx=context;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(ctx);
        View view = layoutInflater.inflate(R.layout.sectionrow,parent,false);
        return new MainRecyclerAdapter.MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
    holder.sectionNameTextView.setText(sectionList.get(position).getSectionName());
    ChildRecyclerAdapter childRecyclerAdapter=new ChildRecyclerAdapter(ctx,sectionList.get(position).getSectionItems());
    holder.childRecyclerView.setAdapter(childRecyclerAdapter);
    }

    @Override
    public int getItemCount() {
        return sectionList.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        TextView sectionNameTextView;
        RecyclerView childRecyclerView;
        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            sectionNameTextView=itemView.findViewById(R.id.sectionNameTextView);
            childRecyclerView=itemView.findViewById(R.id.child_recycler_view);
        }
    }
}

package com.techone.instagramclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SearchActivityAdapter extends RecyclerView.Adapter<SearchActivityAdapter.SearchViewHolder> {
    Context context;
    ArrayList<SearchActivityModel> data=new ArrayList<>();

    public SearchActivityAdapter(Context context, ArrayList<SearchActivityModel> data) {
        this.context = context;
        this.data = data;
    }


    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater myInflater=LayoutInflater.from(context);
        View myownview =myInflater.inflate(R.layout.search_layout_recycler_view,parent,false);
        return new SearchActivityAdapter.SearchViewHolder(myownview);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        holder.r2img1.setImageResource(data.get(position).getR2img1());
        holder.r3img1.setImageResource(data.get(position).getR3img1());
        holder.r4img1.setImageResource(data.get(position).getR4img1());
        holder.r5img1.setImageResource(data.get(position).getR5img1());
        holder.r6img1.setImageResource(data.get(position).getR6img1());
        holder.r7img1.setImageResource(data.get(position).getR7img1());
        holder.r8img1.setImageResource(data.get(position).getR8img1());
        holder.r2img2.setImageResource(data.get(position).getR2img1());
        holder.r3img2.setImageResource(data.get(position).getR3img1());
        holder.r4img2.setImageResource(data.get(position).getR4img1());
        holder.r5img2.setImageResource(data.get(position).getR5img1());
        holder.r6img2.setImageResource(data.get(position).getR6img1());
        holder.r7img2.setImageResource(data.get(position).getR7img1());
        holder.r8img2.setImageResource(data.get(position).getR8img1());
        holder.r2img3.setImageResource(data.get(position).getR2img1());
          holder.r3img3.setImageResource(data.get(position).getR3img1());
//        holder.r4img3.setImageResource(data.get(position).getR4img1());
        holder.r5img3.setImageResource(data.get(position).getR5img1());
        holder.r6img3.setImageResource(data.get(position).getR6img1());
//        holder.r7img3.setImageResource(data.get(position).getR7img1());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class SearchViewHolder extends RecyclerView.ViewHolder {
        ImageView r2img1,r3img1,r4img1,r5img1,r6img1,r7img1,r8img1,r2img2,r3img2,r4img2,r5img2,r6img2,r7img2,r8img2,r2img3,r3img3,r4img3,r5img3,r6img3,r7img3;
        public SearchViewHolder(@NonNull View itemView) {
            super(itemView);
            r2img1=itemView.findViewById(R.id.r2img1);
            r3img1=itemView.findViewById(R.id.r3img1);
            r4img1=itemView.findViewById(R.id.r4img1);
            r5img1=itemView.findViewById(R.id.r5img1);
            r6img1=itemView.findViewById(R.id.r6img1);
            r7img1=itemView.findViewById(R.id.r7img1);
            r8img1=itemView.findViewById(R.id.r8img1);
            r2img2=itemView.findViewById(R.id.r2img2);
            r3img2=itemView.findViewById(R.id.r3img2);
            r4img2=itemView.findViewById(R.id.r4img2);
            r5img2=itemView.findViewById(R.id.r5img2);
            r6img2=itemView.findViewById(R.id.r6img2);
            r7img2=itemView.findViewById(R.id.r7img2);
            r8img2=itemView.findViewById(R.id.r8img2);
            r2img3=itemView.findViewById(R.id.r2img3);
            r3img3=itemView.findViewById(R.id.r3img3);
            r4img3=itemView.findViewById(R.id.r4img3);
            r5img3=itemView.findViewById(R.id.r5img3);
            r6img3=itemView.findViewById(R.id.r6img3);
            r7img3=itemView.findViewById(R.id.r7img3);

        }
    }
}

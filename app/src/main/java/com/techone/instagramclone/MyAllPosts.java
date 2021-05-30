package com.techone.instagramclone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MyAllPosts extends Fragment {
        RecyclerView myAllPhtosRecyclerView;
    public MyAllPosts() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_my_all_posts, container, false);
        myAllPhtosRecyclerView = view.findViewById(R.id.myAllPhotosRecyclerView);
        ArrayList<MyPhotosModel> data = new ArrayList<>();
        data.add(new MyPhotosModel(R.drawable.allu1));
        data.add(new MyPhotosModel(R.drawable.allu2));
        data.add(new MyPhotosModel(R.drawable.allu3));
        data.add(new MyPhotosModel(R.drawable.allu4));
        data.add(new MyPhotosModel(R.drawable.allu5));


        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),3);
        myAllPhtosRecyclerView.setLayoutManager(gridLayoutManager);
        MyPhotosAdapter myPhotosAdapter = new MyPhotosAdapter(getContext(),data);

        myAllPhtosRecyclerView.setAdapter(myPhotosAdapter);

        return view;
    }
}
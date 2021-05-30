package com.techone.instagramclone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MyAllTaggedPosts extends Fragment {

    public MyAllTaggedPosts() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_my_all_tagged_posts, container, false);
        RecyclerView myAllTaggedPhtosRecyclerView;
        myAllTaggedPhtosRecyclerView = view.findViewById(R.id.myAllTaggedPhotosRecyclerView);
        ArrayList<MyPhotosModel> data = new ArrayList<>();
        data.add(new MyPhotosModel(R.drawable.bunny));
        data.add(new MyPhotosModel(R.drawable.allu1));
        data.add(new MyPhotosModel(R.drawable.allu2));
        data.add(new MyPhotosModel(R.drawable.allu3));
        data.add(new MyPhotosModel(R.drawable.allu4));
        data.add(new MyPhotosModel(R.drawable.allu5));
        data.add(new MyPhotosModel(R.drawable.allu6));

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),3);
        myAllTaggedPhtosRecyclerView.setLayoutManager(gridLayoutManager);
        MyPhotosAdapter myPhotosAdapter = new MyPhotosAdapter(getContext(),data);

        myAllTaggedPhtosRecyclerView.setAdapter(myPhotosAdapter);
return view;
    }
}
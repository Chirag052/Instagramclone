package com.techone.instagramclone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SearchFragment extends Fragment {
    RecyclerView searchactivityrecyclerview;
    public SearchFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_search, container, false);
        searchactivityrecyclerview = view.findViewById(R.id.search_recycler_view);
        ArrayList<SearchActivityModel> data = new ArrayList<>();
        data.add(new SearchActivityModel(R.drawable.startuppost,R.drawable.alia_profile,R.drawable.laughter_club_post,
                R.drawable.hrithik,R.drawable.udaipurblog,R.drawable.ranbir,R.drawable.samantha));
        data.add(new SearchActivityModel(R.drawable.ranbir_profile,R.drawable.alia_profile,R.drawable.laughter_club_post,
                R.drawable.hrithik,R.drawable.udaipurblog,R.drawable.laughtercolors,R.drawable.samantha));
        data.add(new SearchActivityModel(R.drawable.startuppost,R.drawable.alia_profile,R.drawable.prabhas_profile,
                R.drawable.hrithik,R.drawable.udaipurblog,R.drawable.ranbir,R.drawable.samantha));
        data.add(new SearchActivityModel(R.drawable.startuppost,R.drawable.alia_profile,R.drawable.laughter_club_post,
                R.drawable.hrithik,R.drawable.udaipurblog,R.drawable.laughter_club_post,R.drawable.samantha));



        searchactivityrecyclerview = view.findViewById(R.id.search_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        searchactivityrecyclerview.setLayoutManager(linearLayoutManager);
        SearchActivityAdapter searchActivityAdapter = new SearchActivityAdapter(getContext(),data);
        searchactivityrecyclerview.setAdapter(searchActivityAdapter);

        return view;
    }
}
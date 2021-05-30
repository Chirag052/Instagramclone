package com.techone.instagramclone.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.techone.instagramclone.PostAdapter;
import com.techone.instagramclone.PostModel;
import com.techone.instagramclone.R;
import com.techone.instagramclone.StatusBarAdapter;
import com.techone.instagramclone.StatusBarModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    RecyclerView statusbarRecyclerView;
    RecyclerView postRecyclerView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        statusbarRecyclerView=view.findViewById(R.id.status_bar_recycler_view);
        ArrayList<StatusBarModel>data = new ArrayList<>();
        data.add(new StatusBarModel(R.drawable.bunny,"Your Story"));
        data.add(new StatusBarModel(R.drawable.alia_profile,"alia_bhatt9"));
        data.add(new StatusBarModel(R.drawable.prabhas_profile,"actorprabhas"));
        data.add(new StatusBarModel(R.drawable.hrithik,"hrithikroshan"));
        data.add(new StatusBarModel(R.drawable.udaipurblog,"udaipurblog"));
        data.add(new StatusBarModel(R.drawable.laughter_club_profile,"laughter.club"));
        data.add(new StatusBarModel(R.drawable.ranbir_profile,"ranbir_kapoor"));
        data.add(new StatusBarModel(R.drawable.laughtercolors,"laughtercolours"));
        data.add(new StatusBarModel(R.drawable.samantha,"samantharuthprabhuoffl"));



        postRecyclerView = view.findViewById(R.id.post_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        statusbarRecyclerView.setLayoutManager(linearLayoutManager);
        StatusBarAdapter statusBarAdapter = new StatusBarAdapter(getContext(),data);

        statusbarRecyclerView.setAdapter(statusBarAdapter);

        postRecyclerView =view.findViewById(R.id.post_recycler_view);
        ArrayList<PostModel> data1 = new ArrayList<>();
        data1.add(new PostModel("ranbir_kapoor",R.drawable.ranbir_profile,R.drawable.ranbir,"actorprabhas and 140 others","Chill"));
        data1.add(new PostModel("alia_bhatt9",R.drawable.alia_profile,R.drawable.alia,"ranbir_kapoor and 154 others","I am just a dreamer"));
        data1.add(new PostModel("alluarjunonline",R.drawable.bunny,R.drawable.bunny,"ranbir_kapoor and 144 others","My life. My rules. My attitude"));
        data1.add(new PostModel("indianstartupnews",R.drawable.startupprofile,R.drawable.startuppost,"ranbir_kapoor and 183 others","Startup news"));
        data1.add(new PostModel("samantharuthprabhuoffl",R.drawable.samantha,R.drawable.samantha,"laughtercolours and 123 others","Natural"));
        data1.add(new PostModel("laughtercolours",R.drawable.laughtercolors,R.drawable.vikrant,"ranbir_kapoor and 423 others","Friends forever"));
        data1.add(new PostModel("actorprabhas",R.drawable.prabhas_profile,R.drawable.prabhas,"ranbir_kapoor and 120 others","Good things take time"));
        data1.add(new PostModel("laughter.club",R.drawable.laughter_club_profile,R.drawable.laughter_club_post,"laughtercolours and 166 others",""));
        data1.add(new PostModel("udaipurblog",R.drawable.udaipurblog,R.drawable.udaipur_blog_post,"ranbir_kapoor and 220 others",""));
        data1.add(new PostModel("hrithikroshan",R.drawable.hrithik,R.drawable.hrithik,"ranbir_kapoor and 134 others",""));



        postRecyclerView = view.findViewById(R.id.post_recycler_view);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext());
        postRecyclerView.setLayoutManager(linearLayoutManager1);
        PostAdapter postAdapter = new PostAdapter(getContext(),data1);

        postRecyclerView.setAdapter(postAdapter);

        return view;
    }
}
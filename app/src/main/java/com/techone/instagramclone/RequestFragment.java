package com.techone.instagramclone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class RequestFragment extends Fragment {
    ArrayList<Section> sectionList =new ArrayList<>();
    RecyclerView mainrecyclerview;

    public RequestFragment() {
        // Required empty public constructor
    }
  @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_request, container, false);
      initData();
      mainrecyclerview=view.findViewById(R.id.main_recycler_view);
      MainRecyclerAdapter mainRecyclerAdapter = new MainRecyclerAdapter(getContext(),sectionList);
      mainrecyclerview.setAdapter(mainRecyclerAdapter);

      return view;


  }
    private void initData(){
        String sectionOneName = "This Week";
        ArrayList<SectionItems> sectionOneItems = new ArrayList<>();
        sectionOneItems.add(new SectionItems("jitendrasoni8959, niki.preety and 132 others liked your post.",R.drawable.startupprofile,R.drawable.bunny));
        sectionOneItems.add(new SectionItems("jain_ritika9 Liked Your Post",R.drawable.alia,R.drawable.bunny));
        sectionOneItems.add(new SectionItems("indianstartupnews just posted and IGTV video.",R.drawable.startuppost));
        sectionOneItems.add(new SectionItems("monty7498 Liked Your Post",R.drawable.prabhas,R.drawable.bunny));
        sectionOneItems.add(new SectionItems("akshmehta576 Liked Your Post",R.drawable.ranbir_profile,R.drawable.bunny));
        sectionOneItems.add(new SectionItems("pooja_khatwani liked your comment: cutiee",R.drawable.alia));

        String sectionTwoName = "This Month";
        ArrayList<SectionItems> sectionTwoItems = new ArrayList<>();
        sectionTwoItems.add(new SectionItems("jitendrasoni8959, niki.preety and 132 others liked your post.",R.drawable.ranbir));
        sectionTwoItems.add(new SectionItems("udaipur.cty just posted and IGTV video.",R.drawable.alia));
        sectionTwoItems.add(new SectionItems("pooja_khatwani mentioned you in a comment: @alluarjunonline thanks bro",R.drawable.prabhas));
        sectionTwoItems.add(new SectionItems("pooja_khatwani liked your comment: cutiee",R.drawable.alia));

        String sectionThreeName = "Earlier";
        ArrayList<SectionItems> sectionThreeItems = new ArrayList<>();
        sectionThreeItems.add(new SectionItems("pratham_19_20 Liked Your post.",R.drawable.ranbir_profile,R.drawable.bunny));
        sectionThreeItems.add(new SectionItems("bhoogarv_18 Liked Your comment: @bhoogarv_18 ty ty",R.drawable.prabhas_profile,R.drawable.bunny));
        sectionThreeItems.add(new SectionItems("shalurameja commented: Handsome beta ",R.drawable.alia,R.drawable.bunny));

        sectionList.add(new Section(sectionOneName,sectionOneItems));
        sectionList.add(new Section(sectionTwoName,sectionTwoItems));
        sectionList.add(new Section(sectionThreeName,sectionThreeItems));

        Log.i("TAGG",""+sectionList);
    }
}
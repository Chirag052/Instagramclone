package com.techone.instagramclone;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class UserProfileFragment extends Fragment {
    ViewPager viewPager;
    TabLayout tabLayout;
    RecyclerView userProfileStatusRecyclerView;
    MainAdapter adapter;
    public UserProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_user_profile, container, false);
        userProfileStatusRecyclerView = view.findViewById(R.id.mystories_recycler_view);
        ArrayList<StatusBarModel> data = new ArrayList<>();
        data.add(new StatusBarModel(R.drawable.bunny,"Your Story"));
        data.add(new StatusBarModel(R.drawable.allu1,"Kids"));
        data.add(new StatusBarModel(R.drawable.allu2,"ARHA"));
        data.add(new StatusBarModel(R.drawable.allu3,"NISCHAY WE..."));
        data.add(new StatusBarModel(R.drawable.allu4,"1st Story"));



        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        userProfileStatusRecyclerView.setLayoutManager(linearLayoutManager);
        StatusBarAdapter statusBarAdapter = new StatusBarAdapter(getContext(),data);

        userProfileStatusRecyclerView.setAdapter(statusBarAdapter);
        viewPager = view.findViewById(R.id.viewpager);
        tabLayout = view.findViewById(R.id.tablayout);
        adapter = new MainAdapter(getChildFragmentManager());
        adapter.addFragment(new MyAllPosts(),"");
        adapter.addFragment(new MyAllTaggedPosts(),"");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_baseline_grid_on_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.tag_icon);

        return view;
    }
    private class MainAdapter extends FragmentPagerAdapter {


        ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();


        public MainAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }
        public void addFragment(Fragment fragment, String title) {
            fragmentArrayList.add(fragment);
            stringArrayList.add(title);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragmentArrayList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentArrayList.size();
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return null;
        }

    }

}
package com.example.coffee;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class PagerFragment1 extends Fragment {

    public PagerFragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_pager, container, false);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        ArrayList<RewardModel> data = new ArrayList<RewardModel>();
        data.add(new RewardModel("Chocolate Cookie", "+200 points"));
        data.add(new RewardModel("Hot Chocolate Extravaganza", "+300 points"));
        data.add(new RewardModel("Buttery Scone", "+200 points"));
        data.add(new RewardModel("Coffee", "+100 points"));

        recyclerView.setAdapter(new RecyclerAdapterRewards(data));
        return rootView;
    }

}

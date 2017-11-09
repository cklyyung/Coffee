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

public class PagerFragment2 extends Fragment {

    public PagerFragment2() {
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

        ArrayList<HistoryModel> data = new ArrayList<>();
        data.add(new HistoryModel("Nov 4, 2017", "$2.00", "20 points"));
        data.add(new HistoryModel("Nov 2, 2017", "$1.00", "10 points"));
        data.add(new HistoryModel("Nov 1, 2017", "$3.00", "30 points"));
        data.add(new HistoryModel("Oct 30, 2017", "$4.00", "40 points"));
        data.add(new HistoryModel("Oct 27, 2017", "$2,00", "20 points"));

        recyclerView.setAdapter(new RecyclerAdapterHistory(data));
        return rootView;
    }

}

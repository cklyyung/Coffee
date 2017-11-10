package com.example.coffee;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by carayung on 2017-11-09.
 */

public class RecyclerAdapterRewards extends RecyclerView.Adapter<RecyclerAdapterRewards.MyViewHolder> {

    private ArrayList<RewardModel> dataSet;
    private boolean setOnClick = false;

    public RecyclerAdapterRewards(ArrayList<RewardModel> data, boolean setOnClick) {
        this.dataSet = data;
        this.setOnClick = setOnClick;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewPoints;
        TextView textViewName;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewPoints = itemView.findViewById(R.id.textview_reward_points);
            this.textViewName = itemView.findViewById(R.id.textview_reward_name);

        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);

        if (setOnClick) {
            view.setOnClickListener(MainActivity.myOnClickListener);
        } else {
            view.setOnClickListener(MainActivity.myOnClickListener1);
        }
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView textViewName = holder.textViewName;
        TextView textViewPoints = holder.textViewPoints;

        textViewName.setText(dataSet.get(listPosition).getName());
        textViewPoints.setText(dataSet.get(listPosition).getPoints());
    }


    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}


package com.example.coffee;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by carayung on 2017-11-09.
 */

public class RecyclerAdapterHistory extends RecyclerView.Adapter<RecyclerAdapterHistory.MyViewHolder> {

    private ArrayList<HistoryModel> dataSet;

    public RecyclerAdapterHistory(ArrayList<HistoryModel> data) {
        this.dataSet = data;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewPointsEarned;
        TextView textViewDate;
        TextView textViewAmountSpent;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewPointsEarned = itemView.findViewById(R.id.textview_history_points);
            this.textViewDate = itemView.findViewById(R.id.textview_history_date);
            this.textViewAmountSpent = itemView.findViewById(R.id.textview_history_amount);

        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview2, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView textViewPointsEarned = holder.textViewPointsEarned;
        TextView textViewDate = holder.textViewDate;
        TextView textViewAmountSpent = holder.textViewAmountSpent;

        textViewPointsEarned.setText(dataSet.get(listPosition).getPoints());
        textViewDate.setText(dataSet.get(listPosition).getDate());
        textViewAmountSpent.setText(dataSet.get(listPosition).getAmount());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}



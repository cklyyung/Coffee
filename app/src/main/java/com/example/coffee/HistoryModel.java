package com.example.coffee;

/**
 * Created by carayung on 2017-11-09.
 */

public class HistoryModel {

    String date;
    String amount;
    String points;

    public HistoryModel(String date, String amount, String points){
        this.date = date;
        this.amount = amount;
        this.points = points;
    }

    public String getDate() {
        return date;
    }

    public String getAmount() { return amount; }

    public String getPoints() {
        return points;
    }
}

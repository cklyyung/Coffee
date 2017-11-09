package com.example.coffee;

/**
 * Created by carayung on 2017-11-09.
 */

public class RewardModel {
    String name;
    String points;

    public RewardModel(String name, String points){
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public String getPoints() {
        return points;
    }

}
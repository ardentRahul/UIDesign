package com.rahuldhar.uidesign.Models;

public class LeaderBoardModel {

    private String number;
    private int drawable;
    private String name;
    private String points;

    public LeaderBoardModel(String number, int drawable, String name, String points) {
        this.number = number;
        this.drawable = drawable;
        this.name = name;
        this.points = points;
    }

    public String getNumber() {
        return number;
    }

    public int getDrawable() {
        return drawable;
    }

    public String getName() {
        return name;
    }

    public String getPoints() {
        return points;
    }
}

package com.rahuldhar.uidesign.Models;

public class DashBoardModel {

    private int drawable;
    private String text1;
    private String text2;

    public DashBoardModel(int drawable, String text1, String text2) {
        this.drawable = drawable;
        this.text1 = text1;
        this.text2 = text2;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
}

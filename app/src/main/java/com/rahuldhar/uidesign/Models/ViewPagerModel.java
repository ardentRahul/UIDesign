package com.rahuldhar.uidesign.Models;

public class ViewPagerModel {

    private String chapter;
    private String name;
    private int drawable;
    private int info;

    public ViewPagerModel(String chapter, String name, int drawable, int info) {
        this.chapter = chapter;
        this.name = name;
        this.drawable = drawable;
        this.info = info;
    }

    public String getChapter() {
        return chapter;
    }

    public String getName() {
        return name;
    }

    public int getDrawable() {
        return drawable;
    }

    public int getInfo() {
        return info;
    }
}

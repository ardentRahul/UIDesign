package com.rahuldhar.uidesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.rahuldhar.uidesign.Adapters.ViewPagerAdapter;
import com.rahuldhar.uidesign.Models.LeaderBoardModel;
import com.rahuldhar.uidesign.Models.ViewPagerModel;

import java.util.ArrayList;

public class SubModulesItemActivity extends AppCompatActivity {

    private ArrayList viewPagerList;
    private ViewPager viewPager;
    private TabLayout tabDots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_modules_item);
        viewPager = findViewById(R.id.viewPager);
        tabDots = findViewById(R.id.tabDots);
        viewPagerList = new ArrayList();
        viewPagerList.add(new ViewPagerModel("Chapter 1/6","Why Buy Stocks?",R.drawable.viewpager_one,R.string.stockMarket));
        viewPagerList.add(new ViewPagerModel("Chapter 2/6","Stock Market",R.drawable.viewpager_two,R.string.stockMarket));
        viewPagerList.add(new ViewPagerModel("Chapter 3/6","Compound Magic",R.drawable.viewpager_three,R.string.stockMarket));
        viewPagerList.add(new ViewPagerModel("Chapter 4/6","Why Buy Stocks?",R.drawable.viewpager_four,R.string.stockMarket));
        viewPagerList.add(new ViewPagerModel("Chapter 5/6","Stock Market",R.drawable.viewpager_five,R.string.stockMarket));
        viewPagerList.add(new ViewPagerModel("Chapter 6/6","Compound Magic",R.drawable.viewpager_six,R.string.stockMarket));

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(SubModulesItemActivity.this,viewPagerList);
        viewPager.setAdapter(viewPagerAdapter);
        tabDots.setupWithViewPager(viewPager,true);
    }
}
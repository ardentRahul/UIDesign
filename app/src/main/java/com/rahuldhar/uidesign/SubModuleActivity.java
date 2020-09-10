package com.rahuldhar.uidesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rahuldhar.uidesign.Adapters.DashboardAdapter;
import com.rahuldhar.uidesign.Adapters.SubModuleAdapter;
import com.rahuldhar.uidesign.Models.DashBoardModel;

import java.util.ArrayList;

public class SubModuleActivity extends AppCompatActivity {

    private RecyclerView subModuleRecyclerView;
    private ArrayList dashBoardList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_module);

        subModuleRecyclerView = findViewById(R.id.subModuleRecyclerView);
        dashBoardList = new ArrayList();
        dashBoardList.add(new DashBoardModel(R.drawable.submodule_one,"Why Invest?","Why you should invest in stock market?"));
        dashBoardList.add(new DashBoardModel(R.drawable.submodule_two,"Basics of stock market.","Watch now ->"));
        dashBoardList.add(new DashBoardModel(R.drawable.submodule_three,"Blogs & Articles","Read now ->"));
        dashBoardList.add(new DashBoardModel(R.drawable.submodule_four,"Monthly Newsletter","Explore now ->"));
        dashBoardList.add(new DashBoardModel(R.drawable.submodule_five,"Announcements","Explore now ->"));

        subModuleRecyclerView.setLayoutManager(new LinearLayoutManager(SubModuleActivity.this));
        SubModuleAdapter subModuleAdapter =new SubModuleAdapter(SubModuleActivity.this,dashBoardList);
        subModuleRecyclerView.setAdapter(subModuleAdapter);
    }
}
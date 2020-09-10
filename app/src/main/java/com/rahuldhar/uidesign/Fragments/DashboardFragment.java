package com.rahuldhar.uidesign.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rahuldhar.uidesign.Adapters.DashboardAdapter;
import com.rahuldhar.uidesign.Models.DashBoardModel;
import com.rahuldhar.uidesign.R;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {

    private RecyclerView dashBoardRecyclerView;
    private ArrayList dashBoardList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View view = inflater.inflate(R.layout.landing_fragment, viewGroup, false);
        dashBoardRecyclerView = view.findViewById(R.id.dashboardRecyclerView);
        dashBoardList = new ArrayList();
        dashBoardList.add(new DashBoardModel(R.drawable.dashboard_first,"Learn with RNR","Start now ->"));
        dashBoardList.add(new DashBoardModel(R.drawable.dashboard_second,"Videos","Watch now ->"));
        dashBoardList.add(new DashBoardModel(R.drawable.dashboard_third,"Blogs & Articles","Read now ->"));
        dashBoardList.add(new DashBoardModel(R.drawable.dashboard_fourth,"Monthly Newsletter","Explore now ->"));
        dashBoardList.add(new DashBoardModel(R.drawable.dashboard_fifth,"Announcements","Explore now ->"));
        dashBoardList.add(new DashBoardModel(R.drawable.dashboard_sixth,"Monthly Research","Explore now ->"));

        dashBoardRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        DashboardAdapter dashboardAdapter =new DashboardAdapter(getActivity(),dashBoardList);
        dashBoardRecyclerView.setAdapter(dashboardAdapter);
        return view;
    }

}

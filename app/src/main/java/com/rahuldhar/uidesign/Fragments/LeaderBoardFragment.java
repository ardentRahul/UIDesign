package com.rahuldhar.uidesign.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rahuldhar.uidesign.Adapters.LeaderBoardAdapter;
import com.rahuldhar.uidesign.Models.LeaderBoardModel;
import com.rahuldhar.uidesign.R;
import java.util.ArrayList;
import de.hdodenhof.circleimageview.CircleImageView;

public class LeaderBoardFragment extends Fragment {

    private RecyclerView leaderBoardRecyclerView;
    private ArrayList leaderBoardList;
    private CircleImageView thirdPlaceImage,secondPlaceImage,firstPlaceImage;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View view = inflater.inflate(R.layout.learderboard_fragment, viewGroup, false);
        leaderBoardRecyclerView = view.findViewById(R.id.leaderboardRecyclerView);
        thirdPlaceImage = view.findViewById(R.id.thirdPlaceImage);
        secondPlaceImage = view.findViewById(R.id.secondPlaceImage);
        firstPlaceImage = view.findViewById(R.id.firstPlaceImage);
        Glide.with(this)
                .asDrawable()
                .load(R.drawable.leaderboard_second)
                .into(secondPlaceImage);
        Glide.with(this)
                .asBitmap()
                .load(R.drawable.leaderboard_first)
                .into(firstPlaceImage);
        Glide.with(this)
                .asBitmap()
                .load(R.drawable.leaderboard_third)
                .into(thirdPlaceImage);
        leaderBoardList = new ArrayList();
        leaderBoardList.add(new LeaderBoardModel("4",R.drawable.leaderboard_fourth,"Anjali","1521 Points"));
        leaderBoardList.add(new LeaderBoardModel("5",R.drawable.leaderboard_fifth,"Akansha","1221 Points"));
        leaderBoardList.add(new LeaderBoardModel("6",R.drawable.leaderboard_sixth,"Soni","1210 Points"));
        leaderBoardList.add(new LeaderBoardModel("7",R.drawable.leaderboard_seventh,"Deepa","1021 Points"));
        leaderBoardList.add(new LeaderBoardModel("8",R.drawable.leaderboard_eighth,"Gautam","521 Points"));
        leaderBoardList.add(new LeaderBoardModel("9",R.drawable.leaderboard_ninth,"Manjeet","121 Points"));


        leaderBoardRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        LeaderBoardAdapter leaderBoardAdapter  = new LeaderBoardAdapter(getActivity(),leaderBoardList);
        leaderBoardRecyclerView.setAdapter(leaderBoardAdapter);
        return view;
    }

}

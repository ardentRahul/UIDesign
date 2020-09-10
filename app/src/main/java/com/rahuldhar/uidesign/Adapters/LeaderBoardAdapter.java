package com.rahuldhar.uidesign.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rahuldhar.uidesign.Models.LeaderBoardModel;
import com.rahuldhar.uidesign.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class LeaderBoardAdapter extends RecyclerView.Adapter<LeaderBoardAdapter.RecyclerViewHolder> {

    private Context mCtx;
    private ArrayList<LeaderBoardModel> itemsList;

    public LeaderBoardAdapter(Context mCtx, ArrayList<LeaderBoardModel> itemsList) {
        this.mCtx = mCtx;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public LeaderBoardAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.leaderboard_list, null);
        return new LeaderBoardAdapter.RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LeaderBoardAdapter.RecyclerViewHolder holder, int position) {
        final LeaderBoardModel leaderBoardModel =itemsList.get(position);

        Glide.with(mCtx)
                .asBitmap()
                .load(leaderBoardModel.getDrawable())
                .into(holder.imageView);
        holder.txtNumber.setText(leaderBoardModel.getNumber());
        holder.txtName.setText(leaderBoardModel.getName());
        holder.txtPoints.setText(leaderBoardModel.getPoints());

    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private CircleImageView imageView;
        private TextView txtNumber,txtName,txtPoints;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            txtNumber = itemView.findViewById(R.id.txtNumber);
            txtName = itemView.findViewById(R.id.txtName);
            txtPoints = itemView.findViewById(R.id.txtPoints);
        }
    }
}

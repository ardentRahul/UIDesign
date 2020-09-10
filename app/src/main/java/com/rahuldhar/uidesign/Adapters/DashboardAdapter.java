package com.rahuldhar.uidesign.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rahuldhar.uidesign.Models.DashBoardModel;
import com.rahuldhar.uidesign.R;
import com.rahuldhar.uidesign.SubModuleActivity;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.RecyclerViewHolder> {

    private Context mCtx;
    private ArrayList<DashBoardModel> itemsList;

    public DashboardAdapter(Context mCtx, ArrayList<DashBoardModel> itemsList) {
        this.mCtx = mCtx;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.dashboard_list, null);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, final int position) {
        final DashBoardModel dashBoardModel =itemsList.get(position);

        Glide.with(mCtx)
                .asBitmap()
                .load(dashBoardModel.getDrawable())
                .into(holder.imgDashboardList);
        holder.txtFirst.setText(dashBoardModel.getText1());
        holder.txtSecond.setText(dashBoardModel.getText2());

        if (position == 0){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mCtx.startActivity(new Intent(mCtx, SubModuleActivity.class));
                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgDashboardList;
        private TextView txtFirst,txtSecond;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            imgDashboardList = itemView.findViewById(R.id.imgDashboardList);
            txtFirst = itemView.findViewById(R.id.txtFirst);
            txtSecond = itemView.findViewById(R.id.txtSecond);
        }
    }
}

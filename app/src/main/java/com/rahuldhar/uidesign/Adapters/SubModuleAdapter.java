package com.rahuldhar.uidesign.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rahuldhar.uidesign.Models.DashBoardModel;
import com.rahuldhar.uidesign.R;
import com.rahuldhar.uidesign.SubModuleActivity;
import com.rahuldhar.uidesign.SubModulesItemActivity;

import java.util.ArrayList;

public class SubModuleAdapter extends RecyclerView.Adapter<SubModuleAdapter.RecyclerViewHolder> {

    private Context mCtx;
    private ArrayList<DashBoardModel> itemsList;

    public SubModuleAdapter(Context mCtx, ArrayList<DashBoardModel> itemsList) {
        this.mCtx = mCtx;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public SubModuleAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.submodule_list, null);
        return new SubModuleAdapter.RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubModuleAdapter.RecyclerViewHolder holder, int position) {
        final DashBoardModel dashBoardModel =itemsList.get(position);

        Glide.with(mCtx)
                .asBitmap()
                .load(dashBoardModel.getDrawable())
                .into(holder.imageView);
        holder.txtTitle.setText(dashBoardModel.getText1());
        holder.txtTitle2.setText(dashBoardModel.getText2());

        if (position == 0){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mCtx.startActivity(new Intent(mCtx, SubModulesItemActivity.class));
                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView txtTitle,txtTitle2;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtTitle2 = itemView.findViewById(R.id.txtTitle2);
        }
    }
}

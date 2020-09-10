package com.rahuldhar.uidesign.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.rahuldhar.uidesign.Models.ViewPagerModel;
import com.rahuldhar.uidesign.R;

import java.util.ArrayList;

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private ArrayList<ViewPagerModel> viewPagerModels;

    public ViewPagerAdapter(Context context, ArrayList<ViewPagerModel> viewPagerModels) {
        this.context = context;
        this.viewPagerModels = viewPagerModels;
    }

    @Override
    public int getCount() {
        return viewPagerModels.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull final ViewGroup container, final int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View view = layoutInflater.inflate(R.layout.viewpager_items, null);

        final ViewPagerModel viewPagerModel = viewPagerModels.get(position);
        final ImageView imageView = view.findViewById(R.id.imgViewPagerItem);
        final TextView chapter = view.findViewById(R.id.txtChapterNo);
        final TextView title = view.findViewById(R.id.txtTitle);
        final TextView info = view.findViewById(R.id.txtInformation);

        Glide.with(context)
                .asBitmap()
                .load(viewPagerModel.getDrawable())
                .into(imageView);
        chapter.setText(viewPagerModel.getChapter());
        title.setText(viewPagerModel.getName());
        info.setText(viewPagerModel.getInfo());

        container.addView(view);
        return view;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

}

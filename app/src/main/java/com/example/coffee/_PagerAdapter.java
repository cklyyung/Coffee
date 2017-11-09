package com.example.coffee;

import android.support.v4.view.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by kwang on 2017-11-09.
 */

public class _PagerAdapter extends android.support.v4.view.PagerAdapter {
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(container.getContext()).inflate(R.layout.tier, container, false);
        switch (position) {
            case 0:((ImageView) viewGroup.findViewById(R.id.image_view)).setImageResource(R.drawable.bronze_card);break;
            case 1:((ImageView) viewGroup.findViewById(R.id.image_view)).setImageResource(R.drawable.silver_card);break;
            case 2:((ImageView) viewGroup.findViewById(R.id.image_view)).setImageResource(R.drawable.gold_card);break;
        }
        container.addView(viewGroup);
        return viewGroup;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}

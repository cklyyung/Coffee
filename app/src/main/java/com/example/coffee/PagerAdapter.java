package com.example.coffee;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by carayung on 2017-11-09.
 */

public class PagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public PagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // This determines the fragment for each tab
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PagerFragment();
        } else if (position == 1) {
            return new PagerFragment1();
        } else {
            return new PagerFragment2();
        }
    }

    // This determines the number of tabs
    @Override
    public int getCount() {
        return 3;
    }

    // This determines the title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return "Rewards";
            case 1:
                return "Offers";
            case 2:
                return "History";
            default:
                return null;
        }
    }

}



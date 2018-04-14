package com.example.android.tourguide;

import android.app.FragmentManager;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Florin on 14.04.2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, android.support.v4.app.FragmentManager fragmentManager){
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new AttractionsFragment();
        } else if(position == 1){
            return new RestaurantsFragment();
        } else if(position == 2){
            return new ParksFragment();
        } else return new NightlifeFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return "Attractions";
        } else if (position == 1){
            return "Restaurants";
        } else if (position == 2){
            return "Parks";
        } else return "Nightlife";
    }
}

package com.example.android.tourguide;

import android.app.FragmentManager;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Florin on 14.04.2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(Context context, android.support.v4.app.FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new AttractionsFragment();
        } else if(position == 1){
            return new ParksFragment();
        } else if(position == 2){
            return new RestaurantsFragment();
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
            return "Parks";
        } else if (position == 2){
            return "Restaurants";
        } else return "Nightlife";
    }
}

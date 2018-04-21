package com.example.android.tourguide;

import android.app.FragmentManager;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Florin on 14.04.2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    // Context of the app.
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
            return mContext.getResources().getString(R.string.attractions_tab);
        } else if (position == 1){
            return mContext.getResources().getString(R.string.parks_tab);
        } else if (position == 2){
            return mContext.getResources().getString(R.string.restaurants_tab);
        } else return mContext.getResources().getString(R.string.nightlife_tab);
    }
}
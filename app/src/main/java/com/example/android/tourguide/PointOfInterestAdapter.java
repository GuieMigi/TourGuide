package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Florin on 14.04.2018.
 */

public class PointOfInterestAdapter extends ArrayAdapter<PointOfInterest> {

    public PointOfInterestAdapter(Activity context, ArrayList<PointOfInterest> pois){
        super(context, 0, pois);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.pointofinterest_list, parent, false);
        }

        // Get the PointOfInterest object located at this position in the list.
        PointOfInterest currentPointOfInterest = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID poi_name.
        TextView poiNameTextView = listItemView.findViewById(R.id.poi_name);

        // Get the Point of interest name from the current PointOfInterest object and
        // set this text on the poiName TextView.
        poiNameTextView.setText(currentPointOfInterest.getPoiName());

        // Find the TextView in the list_item.xml layout with the ID poi_address.
        TextView poiAddressTextView = listItemView.findViewById(R.id.poi_address);

        // Get the Point of interest address from the current PointOfInterest object and
        // set this text on the poiName TextView.
        poiAddressTextView.setText(currentPointOfInterest.getPoiAddress());

        // Find the ImageView in the list_item.xml layout with the ID poi_image.
        ImageView poiImageResourceImageView = listItemView.findViewById(R.id.poi_image);

        // Get the Point of interest address from the current PointOfInterest object and
        // set this text on the poiName TextView.
        poiImageResourceImageView.setImageResource(currentPointOfInterest.getPoiImage());

        // Return the whole list item layout (containing 2 TextViews and one ImageView)
        // so that it can be shown in the ListView.
        return listItemView;
    }
}

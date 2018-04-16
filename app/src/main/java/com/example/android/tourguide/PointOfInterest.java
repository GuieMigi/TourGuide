package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Florin on 14.04.2018.
 */

public class PointOfInterest extends AppCompatActivity {

    // The name of the Point of Interest.
    private String mPoiName;
    // The address of the Point of Interest.
    private String mPoiAddress;
    // The website of the Point of Interest.
    private String mPoiDescription;
    // The Image of the Point of Interest.
    private int mPoiImage;

    public PointOfInterest(String poiName, String poiAddress, int poiImage){
        mPoiName = poiName;
        mPoiAddress = poiAddress;
        mPoiImage = poiImage;
    }

    public PointOfInterest(String poiName, String poiAddress, String poiDescription, int poiImage) {
        mPoiName = poiName;
        mPoiAddress = poiAddress;
        mPoiDescription = poiDescription;
        mPoiImage = poiImage;
    }

    // Get the Point of Interest name.
    public String getPoiName(){
        return mPoiName;
    }

    // Get the Point of Interest address.
    public String getPoiAddress(){
        return mPoiAddress;
    }

    // Get the Point of Interest website.
    public String getPoiDescription() {
        return mPoiDescription;
    }

    // Get the Point of Interest image.
    public int getPoiImage(){
        return mPoiImage;
    }
}
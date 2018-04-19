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
    // The description of the Point of Interest.
    private String mPoiDescription;
    // The opening hours of the Point of Interest.
    private String mPoiOpeningHours;
    // The phone number of the Point of Interest.
    private String mPoiPhoneNumber;
    // The website of the Point of Interest.
    private String mPoiWebsite;
    // The Image of the Point of Interest.
    private int mPoiImage;

    public PointOfInterest(String poiName, String poiAddress, String poiOpeningHours, String poiPhoneNumber, String poiWebsite, int poiImage) {
        mPoiName = poiName;
        mPoiAddress = poiAddress;
        mPoiOpeningHours = poiOpeningHours;
        mPoiPhoneNumber = poiPhoneNumber;
        mPoiWebsite = poiWebsite;
        mPoiImage = poiImage;
    }

    public PointOfInterest(String poiName, String poiAddress, String poiPhoneNumber, String poiWebsite, int poiImage) {
        mPoiName = poiName;
        mPoiAddress = poiAddress;
        mPoiPhoneNumber = poiPhoneNumber;
        mPoiWebsite = poiWebsite;
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

    // Get the Point of Interest description.
    public String getPoiDescription() {
        return mPoiDescription;
    }

    // Get the Point of Interest opening hours.
    public String getPoiOpeningHours() {
        return mPoiOpeningHours;
    }

    // Get the Point of Interest phone number.
    public String getPoiPhoneNumber() {
        return mPoiPhoneNumber;
    }

    // Get the Point of Interest website.
    public String getPoiWebsite() {
        return mPoiWebsite;
    }

    // Get the Point of Interest image.
    public int getPoiImage(){
        return mPoiImage;
    }
}
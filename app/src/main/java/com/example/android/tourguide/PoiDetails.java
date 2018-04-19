package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Florin on 15.04.2018.
 */

public class PoiDetails extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poi_details_item);

        Intent getPoiName = getIntent();
        Intent getPoiAddress = getIntent();
        Intent getPoiDescription = getIntent();
        Intent getPoiOpeningHours = getIntent();
        Intent getPoiPhoneNumber = getIntent();
        Intent getPoiWebsite = getIntent();
        Intent getPoiImage = getIntent();

        final String poiName = getPoiName.getStringExtra("POI_NAME");
        final String poiAddress = getPoiAddress.getStringExtra("POI_ADDRESS");
        final String poiDescription = getPoiDescription.getStringExtra("POI_DESCRIPTION");
        final String poiOpeningHours = getPoiOpeningHours.getStringExtra("POI_OPENING_HOURS");
        final String poiPhoneNumber = getPoiPhoneNumber.getStringExtra("POI_PHONE_NUMBER");
        final String poiWebsite = getPoiWebsite.getStringExtra("POI_WEBSITE");
        final int poiImage = getPoiImage.getIntExtra("POI_IMAGE", 0);

        TextView poiNameTextView = findViewById(R.id.poi_name_details);
        TextView poiAddressTextView = findViewById(R.id.poi_address_details);
        TextView poiDescriptionTextView = findViewById(R.id.poi_description_details);
        TextView poiOpeningHoursTextView = findViewById(R.id.poi_opening_hours_details);
        TextView poiPhoneNumberTextView = findViewById(R.id.poi_phone_details);
        TextView poiWebsiteTextView = findViewById(R.id.poi_website_details);
        ImageView poiImageView = findViewById(R.id.poi_image_details);

        poiNameTextView.setText(poiName);
        poiAddressTextView.setText(poiAddress);

        if (poiDescription == null) {
            poiDescriptionTextView.setVisibility(View.GONE);
        } else poiDescriptionTextView.setText(poiDescription);

        if (poiOpeningHours == null) {
            poiOpeningHoursTextView.setVisibility(View.GONE);
        } else poiOpeningHoursTextView.setText(poiOpeningHours);

        if (poiPhoneNumber == null) {
            poiPhoneNumberTextView.setVisibility(View.GONE);
        } else poiPhoneNumberTextView.setText(poiPhoneNumber);

        if (poiWebsite == null) {
            poiWebsiteTextView.setVisibility(View.GONE);
        } else poiWebsiteTextView.setText(poiWebsite);

        poiImageView.setImageResource(poiImage);
    }
}
package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
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
        Intent getPoiImage = getIntent();

        final String poiName = getPoiName.getStringExtra("POI_NAME");
        final String poiAddress = getPoiAddress.getStringExtra("POI_ADDRESS");
        final int poiImage = getPoiImage.getIntExtra("POI_IMAGE", 0);

        TextView poiNameTextView = findViewById(R.id.poi_name_details);
        TextView poiAddressTextView = findViewById(R.id.poi_address_details);
        ImageView poiImageTextView = findViewById(R.id.poi_image_details);

        poiNameTextView.setText(poiName);
        poiAddressTextView.setText(poiAddress);
        poiImageTextView.setImageResource(poiImage);
    }
}

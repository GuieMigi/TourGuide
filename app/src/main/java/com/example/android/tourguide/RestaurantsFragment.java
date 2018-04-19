package com.example.android.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.pointofinterest_list, container, false);

        //Create an ArrayList containing the PointOfInterest.
        final ArrayList<PointOfInterest> pois = new ArrayList<>();
        pois.add(new PointOfInterest(getString(R.string.caru_cu_bere_name), getString(R.string.caru_cu_bere_address),
                getString(R.string.caru_cu_bere_hours), getString(R.string.caru_cu_bere_phone),
                getString(R.string.caru_cu_bere_website), R.drawable.caru_cu_bere));
        pois.add(new PointOfInterest(getString(R.string.nor_sky_casual_restaurant_name), getString(R.string.nor_sky_casual_restaurant_address),
                getString(R.string.nor_sky_casual_restaurant_hours), getString(R.string.nor_sky_casual_restaurant_phone),
                getString(R.string.nor_sky_casual_restaurant_website), R.drawable.nor_sky_casual_restaurant));
        pois.add(new PointOfInterest(getString(R.string.le_bistrot_francais_name), getString(R.string.le_bistrot_francais_address),
                getString(R.string.le_bistrot_francais_hours), getString(R.string.le_bistrot_francais_phone),
                getString(R.string.le_bistrot_francais_website), R.drawable.le_bistrot_francais));
        pois.add(new PointOfInterest(getString(R.string.bucatarasul_cel_dibaci_name), getString(R.string.bucatarasul_cel_dibaci_address),
                getString(R.string.bucatarasul_cel_dibaci_hours), getString(R.string.bucatarasul_cel_dibaci_phone),
                getString(R.string.bucatarasul_cel_dibaci_website), R.drawable.bucatarasul_cel_dibaci));
        pois.add(new PointOfInterest(getString(R.string.kane_name), getString(R.string.kane_address),
                getString(R.string.kane_hours), getString(R.string.kane_phone),
                getString(R.string.kane_website), R.drawable.kane));

        final ListView listView = rootView.findViewById(R.id.list_view);
        PointOfInterestAdapter poiAdapter = new PointOfInterestAdapter(getActivity(), pois);
        listView.setAdapter(poiAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                PointOfInterest pointOfInterest = (PointOfInterest) listView.getItemAtPosition(position);
                Intent openPoiDetails = new Intent(getContext(), PoiDetails.class);
                openPoiDetails.putExtra("POI_NAME", pointOfInterest.getPoiName());
                openPoiDetails.putExtra("POI_ADDRESS", pointOfInterest.getPoiAddress());
                openPoiDetails.putExtra("POI_OPENING_HOURS", pointOfInterest.getPoiOpeningHours());
                openPoiDetails.putExtra("POI_PHONE_NUMBER", pointOfInterest.getPoiPhoneNumber());
                openPoiDetails.putExtra("POI_WEBSITE", pointOfInterest.getPoiWebsite());
                openPoiDetails.putExtra("POI_IMAGE", pointOfInterest.getPoiImage());
                startActivity(openPoiDetails);
            }
        });
        return rootView;
    }
}
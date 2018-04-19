package com.example.android.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NightlifeFragment extends Fragment {


    public NightlifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.pointofinterest_list, container, false);

        //Create an ArrayList containing the PointOfInterest.
        ArrayList<PointOfInterest> pois = new ArrayList<>();
        pois.add(new PointOfInterest(getString(R.string.boa_club_name), getString(R.string.boa_club_address),
                getString(R.string.boa_club_phone), getString(R.string.boa_club_website),
                R.drawable.boa_club));
        pois.add(new PointOfInterest(getString(R.string.bamboo_club_name), getString(R.string.bamboo_club_address),
                getString(R.string.bamboo_club_phone), getString(R.string.bamboo_club_website),
                R.drawable.bamboo_club));
        pois.add(new PointOfInterest(getString(R.string.nomad_skybar_name), getString(R.string.nomad_skybar_address),
                getString(R.string.nomad_skybar_phone), getString(R.string.nomad_skybar_website),
                R.drawable.nomad_skybar));
        pois.add(new PointOfInterest(getString(R.string.control_club_name), getString(R.string.control_club_address),
                getString(R.string.caru_cu_bere_phone), getString(R.string.control_club_website),
                R.drawable.control_club));
        pois.add(new PointOfInterest(getString(R.string.vintage_pub_name), getString(R.string.vintage_pub_address),
                getString(R.string.vintage_pub_phone), getString(R.string.vintage_pub_website),
                R.drawable.vintage_pub));

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
                openPoiDetails.putExtra("POI_PHONE_NUMBER", pointOfInterest.getPoiPhoneNumber());
                openPoiDetails.putExtra("POI_WEBSITE", pointOfInterest.getPoiWebsite());
                openPoiDetails.putExtra("POI_IMAGE", pointOfInterest.getPoiImage());
                startActivity(openPoiDetails);
            }
        });

        return rootView;
    }

}
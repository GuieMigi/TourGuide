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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.pointofinterest_list, container, false);

        //Create an ArrayList containing the PointOfInterest.
        final ArrayList<PointOfInterest> pois = new ArrayList<>();
        pois.add(new PointOfInterest(getString(R.string.parcul_herastrau_name),
                getString(R.string.parcul_herastrau_address), getString(R.string.parcul_herastrau_description),
                R.drawable.parcul_herastrau));
        pois.add(new PointOfInterest(getString(R.string.parcul_cismigiu_name),
                getString(R.string.parcul_cismigiu_address), getString(R.string.parcul_cismigiu_description),
                R.drawable.parcul_cismigiu));
        pois.add(new PointOfInterest(getString(R.string.parcul_carol_name),
                getString(R.string.parcul_carol_address), getString(R.string.parcul_carol_description),
                R.drawable.parcul_carol));
        pois.add(new PointOfInterest(getString(R.string.parcul_alexandru_ioan_cuza_name),
                getString(R.string.parcul_alexandru_ioan_cuza_address), getString(R.string.parcul_alexandru_ioan_cuza_description),
                R.drawable.parcul_alexandru_ioan_cuza));
        pois.add(new PointOfInterest(getString(R.string.parcul_tineretului_name),
                getString(R.string.parcul_tineretului_address), getString(R.string.parcul_tineretului_description),
                R.drawable.parcul_tineretului));

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
                openPoiDetails.putExtra("POI_DESCRIPTION", pointOfInterest.getPoiDescription());
                openPoiDetails.putExtra("POI_IMAGE", pointOfInterest.getPoiImage());
                startActivity(openPoiDetails);
            }
        });
        return rootView;
    }

}

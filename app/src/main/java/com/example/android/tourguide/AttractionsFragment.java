package com.example.android.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.pointofinterest_list, container, false);

        // Create an ArrayList containing the PointOfInterest.
        final ArrayList<PointOfInterest> pois = new ArrayList<>();
        pois.add(new PointOfInterest(getString(R.string.ateneul_roman_name), getString(R.string.ateneul_roman_address),
                getString(R.string.ateneul_roman_description), R.drawable.ateneul_roman));
        pois.add(new PointOfInterest(getString(R.string.arcul_de_triumf_name), getString(R.string.arcul_de_triumf_address),
                getString(R.string.arcul_de_triumf_description), R.drawable.arcul_de_triumf));
        pois.add(new PointOfInterest(getString(R.string.palatul_cec_name), getString(R.string.palatul_cec_address),
                getString(R.string.palatul_cec_description), R.drawable.palatul_cec));
        pois.add(new PointOfInterest(getString(R.string.palatul_parlamentului_name), getString(R.string.palatul_parlamentului_address),
                getString(R.string.palatul_parlamentului_description), R.drawable.palatul_parlamentului));
        pois.add(new PointOfInterest(getString(R.string.teatrul_national_bucuresti_name), getString(R.string.teatrul_national_bucuresti_address),
                getString(R.string.teatrul_national_bucuresti_description), R.drawable.teatrul_national_bucuresti));

        // Create a PointOfInterestAdapter whose data source is a list of PointOfInterest.
        final ListView listView = rootView.findViewById(R.id.list_view);
        PointOfInterestAdapter poiAdapter = new PointOfInterestAdapter(getActivity(), pois);
        // Make the ListView use the WordAdapter created above.
        listView.setAdapter(poiAdapter);

        // OnItemClickListener that finds the clicked item in the ListView
        // and send the information to the next activity using an Intent.
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
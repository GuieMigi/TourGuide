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
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.pointofinterest_list, container, false);

        //Create an ArrayList containing the PointOfInterest.
        final ArrayList<PointOfInterest> pois = new ArrayList<PointOfInterest>();
        pois.add(new PointOfInterest("Ateneul Român", "Strada Benjamin Franklin nr. 1-3, București", R.drawable.ateneul_roman));
        pois.add(new PointOfInterest("Arcul de Triumf", "Piața Arcul de Triumf, București", R.drawable.arcul_de_triumf));
        pois.add(new PointOfInterest("Palatul CEC", "Calea Victoriei nr. 13, București", R.drawable.palatul_cec));
        pois.add(new PointOfInterest("Palatul Parlamentului", "Strada Izvor 2-4, București", R.drawable.palatul_parlamentului));
        pois.add(new PointOfInterest("Teatrul Național București", "Bulevardul Nicolae Bălcescu nr. 2, București", R.drawable.teatrul_national_bucuresti));

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
                openPoiDetails.putExtra("POI_IMAGE", pointOfInterest.getPoiImage());
                startActivity(openPoiDetails);
            }
        });

        return rootView;
    }

}
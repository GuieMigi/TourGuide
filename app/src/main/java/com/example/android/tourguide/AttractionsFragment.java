package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        final ListView listView = rootView.findViewById(R.id.list_view);
        PointOfInterestAdapter poiAdapter = new PointOfInterestAdapter(getActivity(), pois);
        listView.setAdapter(poiAdapter);
        return rootView;
    }

}

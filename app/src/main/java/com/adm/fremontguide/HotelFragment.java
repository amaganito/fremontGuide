package com.adm.fremontguide;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelFragment extends Fragment {

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        ArrayList<LocationInfo> list = new ArrayList<>();
        list.add(new LocationInfo(getString(R.string.hyatt_place), getString(R.string.hyatt_place_address), getString(R.string.hyatt_place_phone)));
        list.add(new LocationInfo(getString(R.string.marriot), getString(R.string.marriot_address), getString(R.string.marriot_phone)));

        //Here we use an adapter and location information to create a list.

        LocationInfoAdapter adapter = new LocationInfoAdapter(getActivity(), list);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);




        return rootView;
    }
}


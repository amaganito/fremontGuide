package com.adm.fremontguide;


import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**

 */
public class FunAndGamesFragment extends Fragment {

    public FunAndGamesFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        ArrayList<LocationInfo> list = new ArrayList<>();
        list.add(new LocationInfo(getString(R.string.century_theaters), getString(R.string.century_theater_address), getString(R.string.centur_theather_phone)));
        list.add(new LocationInfo(getString(R.string.made_up_theater), getString(R.string.made_up_theater_address),getString(R.string.made_up_theater_phone)));
        list.add(new LocationInfo(getString(R.string.cloverleaf), getString(R.string.cloverleaf_address),getString(R.string.cloverleaf_phone)));
        list.add(new LocationInfo(getString(R.string.rockin_jump), getString(R.string.rockin_jump_address),getString(R.string.rockin_jump_phone)));
        list.add(new LocationInfo(getString(R.string.campo_bocce), getString(R.string.campo_bocce_address),getString(R.string.campo_bocce_phone)));
        //Here we use an adapter and location information to create a list.

        LocationInfoAdapter adapter = new LocationInfoAdapter(getActivity(), list);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);




        return rootView;
    }

}

package com.adm.fremontguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**

 */
public class ParksFragment extends Fragment {

    public ParksFragment(){
        //Required empty constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<LocationInfo> list = new ArrayList<>();
        list.add(new LocationInfo(getString(R.string.mission_peak), getString(R.string.mission_peak_address), R.drawable.mission_peak));
        list.add(new LocationInfo(getString(R.string.central_park), getString(R.string.central_park_address),getString(R.string.central_park_phone), R.drawable.central_park));
        list.add(new LocationInfo(getString(R.string.centerville_park), getString(R.string.centerville_address),getString(R.string.centerville_phone), R.drawable.centerville_park));

        LocationInfoAdapter adapter = new LocationInfoAdapter(getActivity(), list);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);


        return rootView;
    }

}

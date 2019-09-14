package com.adm.fremontguide;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**

 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }

    //Has the food information list



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<LocationInfo> list = new ArrayList<>();
        list.add(new LocationInfo(getString(R.string.satomi_sushi),getString(R.string.satomi_address),getString(R.string.satomi_phone)));
        list.add(new LocationInfo(getString(R.string.federico_grill), getString(R.string.federico_address),getString(R.string.federico_phone)));
        list.add(new LocationInfo(getString(R.string.afghan_kabob), getString(R.string.afgan_kabob_address),getString(R.string.afghan_kabob_phone)));
        list.add(new LocationInfo(getString(R.string.tandoori_pizza), getString(R.string.tandoori_pizza_address),getString(R.string.tandoori_pizza_phone)));
        list.add(new LocationInfo(getString(R.string.bronco_billy), getString(R.string.bronco_bill_address),getString(R.string.bronco_billy_phone)));

        //Here we use an adapter and location information to create a list.

        LocationInfoAdapter adapter = new LocationInfoAdapter(getActivity(), list );

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }




}

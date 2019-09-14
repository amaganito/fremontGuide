package com.adm.fremontguide;

import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class LocationInfoAdapter extends ArrayAdapter<LocationInfo> {

    public LocationInfoAdapter(Context context, ArrayList<LocationInfo> locationInfo){
        super(context, 0, locationInfo);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listInfoView = convertView;
        if (listInfoView == null) {
            listInfoView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        LocationInfo locationInfo = getItem(position);

        TextView locationName = (TextView) listInfoView.findViewById(R.id.location_name);

        locationName.setText(locationInfo.getName());

        TextView address = (TextView) listInfoView.findViewById(R.id.address);

        address.setText(locationInfo.getAddress());

        TextView phoneNumber = (TextView) listInfoView.findViewById(R.id.phone_number);

        ImageView phoneIcon = (ImageView) listInfoView.findViewById(R.id.phoneIcon);

        ImageView imageTest = (ImageView) listInfoView.findViewById(R.id.imageTest);

        // If an image is available, display the image
        if(locationInfo.hasImage()){
            imageTest.setImageResource(locationInfo.getImage());
            imageTest.setVisibility(View.VISIBLE);
        }
        else {
            imageTest.setVisibility(View.GONE);
        }

        //If there is a phone number set it or else it is invisible
        if (locationInfo.hasPhone()) {
            phoneNumber.setText(locationInfo.getPhoneNumber());
            phoneNumber.setVisibility(View.VISIBLE);
            phoneIcon.setVisibility(View.VISIBLE);
        } else {
            phoneNumber.setVisibility(View.GONE);
            phoneIcon.setVisibility(View.GONE);
        }


        return listInfoView;



    }
}

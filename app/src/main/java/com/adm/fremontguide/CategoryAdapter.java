package com.adm.fremontguide;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context lContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        lContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ParksFragment();
        } else  if (position == 1){
            return new FoodFragment();
        } else if (position == 2) {return new HotelFragment();}
        else {return new FunAndGamesFragment();}
    }

   //Return total pages
    @Override
    public int getCount() {
        return 4;
    }

    //Fragment Title on page
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return lContext.getString(R.string.parks);
        } else if (position == 1) {
            return lContext.getString(R.string.food);
        } else if (position == 2) {
            return lContext.getString(R.string.hotels);
        } else {
            return lContext.getString(R.string.funAndGames);
        }
    }

}


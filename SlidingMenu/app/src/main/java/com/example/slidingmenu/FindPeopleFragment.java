package com.example.slidingmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import com.example.slidingmenunavigationdrawer.R;

/**
 * Created by paklap on 09-Sep-16.
 */
public class FindPeopleFragment extends Fragment{
    public FindPeopleFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_find_people, container, false);

        return rootView;
    }
}

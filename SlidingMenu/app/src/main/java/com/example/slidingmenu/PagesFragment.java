package com.example.slidingmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import com.example.slidingmenu.R;

/**
 * Created by paklap on 09-Sep-16.
 */
public class PagesFragment extends Fragment {
    public PagesFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_pages, container, false);

        return rootView;
    }
}

package com.batch2.m0nk3y.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.sql.RowId;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public ImageView imageView;


    public HomeFragment() {
        // Required empty public constructor

    }

    public static HomeFragment newInstanceOf(){
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        imageView = v.findViewById(R.id.imageView);
        return v;
    }

}

package com.example.estacionvl_tc_014.tabs.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.estacionvl_tc_014.tabs.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PageFragment extends Fragment {

    TextView info;
    String txt;

    public PageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_page, container, false);
        info = (TextView) v.findViewById(R.id.info);
        info.setText(txt);
        return v;
    }

    public void setTxt(String txt){
        this.txt = txt;
    }

}

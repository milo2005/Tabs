package com.example.estacionvl_tc_014.tabs.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by EstacionVL-TC-014 on 9/02/16.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {

    List<Fragment> data;

    public PagerAdapter(FragmentManager fm, List<Fragment> data) {
        super(fm);
        this.data = data;
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab "+position;
    }
}

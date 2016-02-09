package com.example.estacionvl_tc_014.tabs;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.estacionvl_tc_014.tabs.adapters.PagerAdapter;
import com.example.estacionvl_tc_014.tabs.fragments.PageFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    List<Fragment> data;
    PagerAdapter adapter;

    Toolbar toolbar;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabs);

        setSupportActionBar(toolbar);

        pager = (ViewPager) findViewById(R.id.pager);
        loadData();

        adapter = new PagerAdapter(getSupportFragmentManager(), data);
        pager.setAdapter(adapter);

        tabLayout.setupWithViewPager(pager);
        tabLayout.setTabsFromPagerAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();

        PageFragment p1 = new PageFragment();
        p1.setTxt("Pagina Uno");
        data.add(p1);

        PageFragment p2 = new PageFragment();
        p2.setTxt("Pagina Dos");
        data.add(p2);

        PageFragment p3 = new PageFragment();
        p3.setTxt("Pagina Tres");
        data.add(p3);

    }
}

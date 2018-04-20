package com.example.android.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments.
        ViewPager viewPager = findViewById(R.id.view_pager);

        // Create an adapter that knows which fragment should be shown on each page.
        CategoryAdapter adapter = new CategoryAdapter(MainActivity.this, getSupportFragmentManager());

        // Set the adapter onto the view pager.
        viewPager.setAdapter(adapter);

        // Find the TabLayout that will display tabs.
        TabLayout tabLayout = findViewById(R.id.tab_layout);

        // Set the TabLayout with the ViewPager.
        tabLayout.setupWithViewPager(viewPager);
    }
}
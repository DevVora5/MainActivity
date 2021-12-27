package com.example.mainactivity;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.navigation.NavigationView;
import com.ms.square.android.expandabletextview.ExpandableTextView;

public class FAQ extends AppCompatActivity {

    Toolbar toolbar;
    CoordinatorLayout coordinatorLayout;
    NavigationView navigationView;
    DrawerLayout drawerLayout;

    ActionBarDrawerToggle DrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        ExpandableTextView expTv1 = (ExpandableTextView) findViewById(R.id.expand_text_view1)
                .findViewById(R.id.expand_text_view1);
        expTv1.setText(getString(R.string.q1));

        ExpandableTextView expTv2 = (ExpandableTextView) findViewById(R.id.expand_text_view2)
                .findViewById(R.id.expand_text_view2);
        expTv2.setText(getString(R.string.q2));

        ExpandableTextView expTv3 = (ExpandableTextView) findViewById(R.id.expand_text_view3)
                .findViewById(R.id.expand_text_view3);
        expTv3.setText(getString(R.string.q3));

        ExpandableTextView expTv4 = (ExpandableTextView) findViewById(R.id.expand_text_view4)
                .findViewById(R.id.expand_text_view4);
        expTv4.setText(getString(R.string.q4));

        ExpandableTextView expTv5 = (ExpandableTextView) findViewById(R.id.expand_text_view5)
                .findViewById(R.id.expand_text_view5);
        expTv5.setText(getString(R.string.q5));

        toolbar=findViewById(R.id.toolbar1);
        coordinatorLayout=findViewById(R.id.coordinator1);
        navigationView=findViewById(R.id.nav_view1);
        drawerLayout=findViewById(R.id.drawer1);

        DrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open, R.string.navigation_drawer_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);

            }
        };
        drawerLayout.setDrawerListener(DrawerToggle);
        DrawerToggle.syncState();
    }
}
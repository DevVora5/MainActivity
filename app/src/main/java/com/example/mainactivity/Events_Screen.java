package com.example.mainactivity;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class Events_Screen extends AppCompatActivity {

    Toolbar toolbar2;
    CoordinatorLayout coordinatorLayout2;
    NavigationView navigationView2;
    DrawerLayout drawerLayout2;

    ActionBarDrawerToggle DrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_screen);
        toolbar2=findViewById(R.id.toolbar2);
        coordinatorLayout2=findViewById(R.id.coordinator2);
        navigationView2=findViewById(R.id.nav_view2);
        drawerLayout2=findViewById(R.id.drawer2);

        DrawerToggle = new ActionBarDrawerToggle(this,drawerLayout2,toolbar2,R.string.navigation_drawer_open, R.string.navigation_drawer_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);

            }
        };
        drawerLayout2.setDrawerListener(DrawerToggle);
        DrawerToggle.syncState();
    }
}
package com.rahuldhar.uidesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rahuldhar.uidesign.Fragments.DashboardFragment;
import com.rahuldhar.uidesign.Fragments.LeaderBoardFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new DashboardFragment());
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()){
                    case R.id.navigation_home:
                        selectedFragment = new DashboardFragment();
                        break;
                    case R.id.navigation_leaderboard:
                        item.setIcon(R.drawable.nav_leaderboard_checked);
                        selectedFragment = new LeaderBoardFragment();
                        break;
                }
                return loadFragment(selectedFragment);
            }
        });

    }

    private boolean loadFragment(Fragment fragment){
        if (fragment!=null)
        {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.homeFrameLayout,fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }
        return false;
    }

}
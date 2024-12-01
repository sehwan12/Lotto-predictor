package com.lotto_predictor.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.lotto_predictor.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // activity_main.xml 레이아웃 파일을 설정

        // BottomNavigationView를 찾습니다.
        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);

        // NavHostFragment를 찾고 NavController를 가져옵니다.
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment);
        if (navHostFragment != null) {
            NavController navController = navHostFragment.getNavController();

            // BottomNavigationView와 NavController를 연결합니다.
            NavigationUI.setupWithNavController(bottomNav, navController);
        }
    }
}

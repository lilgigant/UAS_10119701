package com.example.uas_10119701;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.uas_10119701.Fragment_navigation.Photo;
import com.example.uas_10119701.Fragment_navigation.Profile;
import com.example.uas_10119701.Fragment_navigation.Tentang_aplikasi;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bottom_navigation extends AppCompatActivity {

    //Nama              : Octaryan Marthiyas
    //NIM               : 10119701
    //Tanggal Pengerjaan:  12 april 2021


    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {

            Fragment f = null;
            switch (item.getItemId()) {
                case R.id.menu_profile:
                    f = new Profile();
                    break;
                case R.id.menu_tentang:
                    f = new Tentang_aplikasi();
                    break;
                case R.id.menu_photo:
                    f = new Photo();
                    break;


            }
            getSupportFragmentManager().beginTransaction().replace(R.id.isi, f).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_navigation);

        bottomNavigationView = findViewById(R.id.button_navigation_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);
    }
}
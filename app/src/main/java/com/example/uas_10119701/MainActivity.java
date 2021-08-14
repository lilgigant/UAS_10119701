package com.example.uas_10119701;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uas_10119701.Fragments.Fragment_1;
import com.example.uas_10119701.Fragments.Fragment_2;
import com.example.uas_10119701.Fragments.Fragment_3;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Nama              : Octaryan Marthiyas
    //NIM               : 10119701
    //Tanggal Pengerjaan:  12 april 2021



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_act);

        List<Fragment> list = new ArrayList<>();
        list.add(new Fragment_1());
        list.add(new Fragment_2());
        list.add(new Fragment_3());

        Button button = findViewById(R.id.bttnLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Bottom_navigation.class);
                startActivity(intent);

            }
        });
        Button button1;
        button1 = findViewById(R.id.btnRegister);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Walkthrough.class);
                startActivity(intent);
            }


        });

    }
}

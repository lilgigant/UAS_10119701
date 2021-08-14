package com.example.uas_10119701;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class after_login extends AppCompatActivity {

    //Nama              : Octaryan Marthiyas
    //NIM               : 10119701
    //Tanggal Pengerjaan: 13 agustus 2021

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_login);

        Button profil = findViewById(R.id.btnProfil);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after_login.this, profil_data.class);
                startActivity(intent);




            }
        });
        Button kembali = findViewById(R.id.btnLogout);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after_login.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
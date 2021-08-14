package com.example.uas_10119701.Fragment_navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.uas_10119701.R;

public class Tentang_aplikasi extends Fragment {

    //Nama              : Octaryan Marthiyas
    //NIM               : 10119701
    //Tanggal Pengerjaan: 13 agustus 2021

    @Nullable

    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable  Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tentang_aplikasi, container, false);
    }
}

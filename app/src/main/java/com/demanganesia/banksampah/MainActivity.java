package com.demanganesia.banksampah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;

import com.demanganesia.banksampah.Fragment.AkunFragment;
import com.demanganesia.banksampah.Fragment.HomeFragment;
import com.demanganesia.banksampah.Fragment.LokasiFragment;
import com.demanganesia.banksampah.Fragment.PesanFragment;
import com.demanganesia.banksampah.Fragment.RiwayatFragment;
import com.demanganesia.banksampah.MasukDanDaftar.LoginActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menghilangkan status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        replace(new HomeFragment());
        bottomBar = findViewById(R.id.bottomBar);

        bottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {
                switch (i) {
                    case 0:
                        replace(new HomeFragment());
                        break;

                    case 1:
                        replace(new RiwayatFragment());
                        break;

                    case 2:
                        replace(new LokasiFragment());
                        break;

                    case 3:
                        replace(new PesanFragment());
                        break;

                    case 4:
                        replace(new AkunFragment());
                        break;
                }
                return false;
            }
        });
    }

    private void replace(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,fragment);
        transaction.commit();
    }
}
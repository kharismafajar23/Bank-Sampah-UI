package com.demanganesia.banksampah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BuktiHadiahAntarActivity extends AppCompatActivity {

    BottomNavigationView bottomBar;
    private int waktu_loading = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukti_hadiah_antar);
        //menghilangkan status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        bottomBar = findViewById(R.id.bottomBar);

        bottomBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finish();
                        overridePendingTransition(1,1);
                        return true;
                    case R.id.riwayat:
                        startActivity(new Intent(getApplicationContext(), RiwayatActivity.class));
                        finish();
                        overridePendingTransition(1,1);
                        return true;
                    case R.id.lokasi:
                        startActivity(new Intent(getApplicationContext(), LokasiActivity.class));
                        finish();
                        overridePendingTransition(1,1);
                        return true;
                    case R.id.pesan:
                        startActivity(new Intent(getApplicationContext(), PesanActivity.class));
                        finish();
                        overridePendingTransition(1,1);
                        return true;
                    case R.id.akun:
                        startActivity(new Intent(getApplicationContext(), AkunActivity.class));
                        finish();
                        overridePendingTransition(1,1);
                        return true;
                }
                return false;
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent keBuktiPoin = new Intent(BuktiHadiahAntarActivity.this, NotaHadiahAntarActivity.class);
                startActivity(keBuktiPoin);
                finish();
            }
        }, waktu_loading);
    }

    public void btn_close(View view) {
        onBackPressed();
    }
}
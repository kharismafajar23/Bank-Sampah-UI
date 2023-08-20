package com.demanganesia.banksampah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RiwayatBankSampahActivity extends AppCompatActivity {

    BottomNavigationView bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat_bank_sampah);
        //menghilangkan status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        bottomBar = findViewById(R.id.bottomBar);
        bottomBar.setSelectedItemId(R.id.riwayat);

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
    }

    public void kembali(View view) {
        onBackPressed();
    }

    public void keSampahHarian(View view) {
        startActivity(new Intent(RiwayatBankSampahActivity.this, RiwayatSampahHarianActivity.class));
        finish();
    }
}
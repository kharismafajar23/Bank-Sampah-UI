package com.demanganesia.banksampah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import com.demanganesia.banksampah.MasukDanDaftar.LoginActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AkunActivity extends AppCompatActivity {

    BottomNavigationView bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);
        //menghilangkan status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bottomBar = findViewById(R.id.bottomBar);
        bottomBar.setSelectedItemId(R.id.akun);

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
                        return true;
                }
                return false;
            }
        });
    }

    public void kembali(View view) {
        onBackPressed();
    }

    public void keDataProfil(View view) {
        startActivity(new Intent(AkunActivity.this, DataProfilActivity.class));
    }

    public void keKeamanan(View view) {
        startActivity(new Intent(AkunActivity.this, KeamananActivity.class));
    }

    public void keFAQ(View view) {
        startActivity(new Intent(AkunActivity.this, FaqActivity.class));
    }

    public void kePusatBantuan(View view) {
        startActivity(new Intent(AkunActivity.this, PusatBantuanActivity.class));
    }

    public void keTentang(View view) {
        startActivity(new Intent(AkunActivity.this, TentangActivity.class));
    }

    public void keNotifikasi(View view) {
    }

    public void keluar(View view) {
        startActivity(new Intent(AkunActivity.this, LoginActivity.class));
        finish();
    }
}
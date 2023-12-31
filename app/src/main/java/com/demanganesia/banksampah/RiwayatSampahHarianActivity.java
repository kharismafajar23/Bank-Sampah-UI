package com.demanganesia.banksampah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RiwayatSampahHarianActivity extends AppCompatActivity {

    BottomNavigationView bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat_sampah_harian);
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

    public void keBankSampah(View view) {
        startActivity(new Intent(RiwayatSampahHarianActivity.this, RiwayatActivity.class));
        finish();
    }

    public void keDetailSampahHarian1(View view) {
        String namaPaket = "Paket Premium A";
        String tanggal = "5 Oktober 2022";
        String waktuPenjemputan = "3x Per Minggu";
        String hariPenjemputan = "Senin, Rabu, Jumat";
        String durasi = "1 bulan";
        Number harga = 15000;

        Intent keDetailSampahHarian1 = new Intent(this, DetailRiwayatSampahHarianActivity.class);
        keDetailSampahHarian1.putExtra("namaPaket", namaPaket);
        keDetailSampahHarian1.putExtra("tanggal", tanggal);
        keDetailSampahHarian1.putExtra("waktuPenjemputan", waktuPenjemputan);
        keDetailSampahHarian1.putExtra("hariPenjemputan", hariPenjemputan);
        keDetailSampahHarian1.putExtra("durasi", durasi);
        keDetailSampahHarian1.putExtra("harga", harga.toString());

        startActivity(keDetailSampahHarian1);
    }

    public void keDetailSampahHarian2(View view) {
        String namaPaket = "Paket Premium A";
        String tanggal = "15 November 2022";
        String waktuPenjemputan = "3x Per Minggu";
        String hariPenjemputan = "Senin, Rabu, Jumat";
        String durasi = "1 bulan";
        Number harga = 15000;

        Intent keDetailSampahHarian2 = new Intent(this, DetailRiwayatSampahHarianActivity.class);
        keDetailSampahHarian2.putExtra("namaPaket", namaPaket);
        keDetailSampahHarian2.putExtra("tanggal", tanggal);
        keDetailSampahHarian2.putExtra("waktuPenjemputan", waktuPenjemputan);
        keDetailSampahHarian2.putExtra("hariPenjemputan", hariPenjemputan);
        keDetailSampahHarian2.putExtra("durasi", durasi);
        keDetailSampahHarian2.putExtra("harga", harga.toString());

        startActivity(keDetailSampahHarian2);
    }
}
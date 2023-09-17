package com.demanganesia.banksampah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class DetailRiwayatSampahHarianActivity extends AppCompatActivity {

    TextView TVNamaPaket, TVTanggal, TVWaktuPenjemputan, TVHariPenjemputan, TVDurasi, TVHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_riwayat_sampah_harian);
        //menghilangkan status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TVNamaPaket = findViewById(R.id.TV_nama_paket);
        TVTanggal = findViewById(R.id.TV_tanggal);
        TVWaktuPenjemputan = findViewById(R.id.TV_waktu_penjemputan);
        TVHariPenjemputan = findViewById(R.id.TV_hari_penjemputan);
        TVDurasi = findViewById(R.id.TV_durasi);
        TVHarga = findViewById(R.id.TV_harga);

        TVNamaPaket.setText(getIntent().getStringExtra("namaPaket"));
        TVTanggal.setText(getIntent().getStringExtra("tanggal"));
        TVWaktuPenjemputan.setText(getIntent().getStringExtra("waktuPenjemputan"));
        TVHariPenjemputan.setText(getIntent().getStringExtra("hariPenjemputan"));
        TVDurasi.setText(getIntent().getStringExtra("durasi"));
        TVHarga.setText("Rp "+ getIntent().getStringExtra("harga"));
    }

    public void btn_kembali(View view) {
        onBackPressed();
    }
}
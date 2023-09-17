package com.demanganesia.banksampah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class DetailPaketRegulerActivity extends AppCompatActivity {

    TextView TVnamaPaket, TVWaktuPenjemputan, TVDurasi, TVHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_paket_reguler);
        //menghilangkan status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TVnamaPaket = findViewById(R.id.TV_nama_paket);
        TVWaktuPenjemputan = findViewById(R.id.tv_waktu_penjemputan);
        TVDurasi = findViewById(R.id.tv_durasi);
        TVHarga = findViewById(R.id.TV_total_harga);

        // Merubah  tulisan sesuai paket
        TVnamaPaket.setText(getIntent().getStringExtra("namaPaket"));
        TVWaktuPenjemputan.setText(getIntent().getStringExtra("durasiJemput"));
        TVDurasi.setText(getIntent().getStringExtra("durasi"));
        String biaya = getIntent().getStringExtra("biaya");
        TVHarga.setText("Rp ".concat(biaya));
    }

    public void btn_batal(View view) {
        onBackPressed();
    }

    public void btn_bayar(View view) {
        startActivity(new Intent(this, MasukkanPINActivity.class));
        finish();
    }
}
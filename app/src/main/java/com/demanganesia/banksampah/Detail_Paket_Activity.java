package com.demanganesia.banksampah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class Detail_Paket_Activity extends AppCompatActivity {

    TextView TVNamaPaket, TVWaktuPenjemputan, TVDurasi, TVTotalHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_paket);
        //menghilangkan status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TVNamaPaket = findViewById(R.id.TV_nama_paket);
        TVWaktuPenjemputan = findViewById(R.id.TV_waktu_penjemputan);
        TVDurasi = findViewById(R.id.TV_durasi);
        TVTotalHarga = findViewById(R.id.TV_total_harga);

        // Merubah  tulisan sesuai paket
        TVNamaPaket.setText(getIntent().getStringExtra("namaPaket"));
        TVWaktuPenjemputan.setText(getIntent().getStringExtra("durasiJemput"));
        TVDurasi.setText(getIntent().getStringExtra("durasi"));
        String biaya = getIntent().getStringExtra("biaya");
        TVTotalHarga.setText("Rp ".concat(biaya));

    }

    public void btn_batal(View view) {
        onBackPressed();
    }

    public void btn_bayar(View view) {
        startActivity(new Intent(Detail_Paket_Activity.this, MasukkanPINActivity.class));
        finish();
    }
}
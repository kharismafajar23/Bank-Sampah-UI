package com.demanganesia.banksampah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PaketRegulerActivity extends AppCompatActivity {

    BottomNavigationView bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_reguler);
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
    }

    public void keTopUp(View view) {
        startActivity(new Intent(PaketRegulerActivity.this, SaldoActivity.class));
    }

    public void kePaketRegulerA(View view) {
        String namaPaket = "Paket Reguler A";
        String durasiJemput = "2x Per Minggu";
        String hariPenjemputan = "Selasa & Kamis";
        String durasi = "1 bulan";
        Number biaya = 10000;

        Intent kePaketRegulerA = new Intent(this, DetailPaketRegulerActivity.class);
        kePaketRegulerA.putExtra("namaPaket", namaPaket);
        kePaketRegulerA.putExtra("durasiJemput", durasiJemput);
        kePaketRegulerA.putExtra("hariPenjemputan", hariPenjemputan);
        kePaketRegulerA.putExtra("durasi", durasi);
        kePaketRegulerA.putExtra("biaya", biaya.toString());
        startActivity(kePaketRegulerA);
    }

    public void kePaketRegulerB(View view) {
        String namaPaket = "Paket Reguler B";
        String durasiJemput = "2x Per Minggu";
        String hariPenjemputan = "Selasa & Kamis";
        String durasi = "2 bulan";
        Number biaya = 15000;

        Intent kePaketRegulerB = new Intent(this, DetailPaketRegulerActivity.class);
        kePaketRegulerB.putExtra("namaPaket", namaPaket);
        kePaketRegulerB.putExtra("durasiJemput", durasiJemput);
        kePaketRegulerB.putExtra("hariPenjemputan", hariPenjemputan);
        kePaketRegulerB.putExtra("durasi", durasi);
        kePaketRegulerB.putExtra("biaya", biaya.toString());
        startActivity(kePaketRegulerB);
    }

    public void kePaketRegulerC(View view) {
        String namaPaket = "Paket Reguler C";
        String durasiJemput = "2x Per Minggu";
        String hariPenjemputan = "Selasa & Kamis";
        String durasi = "3 bulan";
        Number biaya = 20000;

        Intent kePaketRegulerC = new Intent(this, DetailPaketRegulerActivity.class);
        kePaketRegulerC.putExtra("namaPaket", namaPaket);
        kePaketRegulerC.putExtra("durasiJemput", durasiJemput);
        kePaketRegulerC.putExtra("hariPenjemputan", hariPenjemputan);
        kePaketRegulerC.putExtra("durasi", durasi);
        kePaketRegulerC.putExtra("biaya", biaya.toString());
        startActivity(kePaketRegulerC);
    }

    public void kePaketRegulerD(View view) {
        String namaPaket = "Paket Reguler D";
        String durasiJemput = "2x Per Minggu";
        String hariPenjemputan = "Selasa & Kamis";
        String durasi = "4 bulan";
        Number biaya = 25000;

        Intent kePaketRegulerD = new Intent(this, DetailPaketRegulerActivity.class);
        kePaketRegulerD.putExtra("namaPaket", namaPaket);
        kePaketRegulerD.putExtra("durasiJemput", durasiJemput);
        kePaketRegulerD.putExtra("hariPenjemputan", hariPenjemputan);
        kePaketRegulerD.putExtra("durasi", durasi);
        kePaketRegulerD.putExtra("biaya", biaya.toString());
        startActivity(kePaketRegulerD);
    }
}
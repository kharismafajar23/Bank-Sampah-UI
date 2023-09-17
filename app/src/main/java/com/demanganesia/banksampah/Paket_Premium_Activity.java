package com.demanganesia.banksampah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Paket_Premium_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_premium);
        //menghilangkan status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void kePaketPremiumA(View view) {
        String namaPaket = "Paket Premium A";
        String durasiJemput = "3x Per Minggu";
        String hariPenjemputan = "Senin, Rabu & Jumat";
        String durasi = "1 bulan";
        Number biaya = 15000;

        Intent kePaketPreminumA = new Intent(this, Detail_Paket_Activity.class);
        kePaketPreminumA.putExtra("namaPaket", namaPaket);
        kePaketPreminumA.putExtra("durasiJemput", durasiJemput);
        kePaketPreminumA.putExtra("hariPenjemputan", hariPenjemputan);
        kePaketPreminumA.putExtra("durasi", durasi);
        kePaketPreminumA.putExtra("biaya", biaya.toString());

        startActivity(kePaketPreminumA);
    }

    public void kePaketPremiumB(View view) {
        String namaPaket = "Paket Premium B";
        String durasiJemput = "3x Per Minggu";
        String hariPenjemputan = "Senin, Rabu & Jumat";
        String durasi = "2 bulan";
        Number biaya = 20000;

        Intent kePaketPreminumB = new Intent(this, Detail_Paket_Activity.class);
        kePaketPreminumB.putExtra("namaPaket", namaPaket);
        kePaketPreminumB.putExtra("durasiJemput", durasiJemput);
        kePaketPreminumB.putExtra("hariPenjemputan", hariPenjemputan);
        kePaketPreminumB.putExtra("durasi", durasi);
        kePaketPreminumB.putExtra("biaya", biaya.toString());

        startActivity(kePaketPreminumB);
    }

    public void kePaketPremiumC(View view) {
        String namaPaket = "Paket Premium C";
        String durasiJemput = "3x Per Minggu";
        String hariPenjemputan = "Senin, Rabu & Jumat";
        String durasi = "3 bulan";
        Number biaya = 25000;

        Intent kePaketPreminumC = new Intent(this, Detail_Paket_Activity.class);
        kePaketPreminumC.putExtra("namaPaket", namaPaket);
        kePaketPreminumC.putExtra("durasiJemput", durasiJemput);
        kePaketPreminumC.putExtra("hariPenjemputan", hariPenjemputan);
        kePaketPreminumC.putExtra("durasi", durasi);
        kePaketPreminumC.putExtra("biaya", biaya.toString());

        startActivity(kePaketPreminumC);
    }

    public void kePaketPremiumD(View view) {
        String namaPaket = "Paket Premium D";
        String durasiJemput = "3x Per Minggu";
        String hariPenjemputan = "Senin, Rabu & Jumat";
        String durasi = "4 bulan";
        Number biaya = 30000;

        Intent kePaketPreminumD = new Intent(this, Detail_Paket_Activity.class);
        kePaketPreminumD.putExtra("namaPaket", namaPaket);
        kePaketPreminumD.putExtra("durasiJemput", durasiJemput);
        kePaketPreminumD.putExtra("hariPenjemputan", hariPenjemputan);
        kePaketPreminumD.putExtra("durasi", durasi);
        kePaketPreminumD.putExtra("biaya", biaya.toString());

        startActivity(kePaketPreminumD);
    }

    public void keTopUp(View view) {
        startActivity(new Intent(Paket_Premium_Activity.this, SaldoActivity.class));
    }


}
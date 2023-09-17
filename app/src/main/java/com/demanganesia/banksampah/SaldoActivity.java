package com.demanganesia.banksampah;

import static android.text.TextUtils.concat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SaldoActivity extends AppCompatActivity {

    BottomNavigationView bottomBar;
    TextView TVSaldo, TVSaldoTunai, TVMetode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saldo);
        //menghilangkan status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        bottomBar = findViewById(R.id.bottomBar);
        TVSaldo = findViewById(R.id.TV_saldo);
        TVSaldoTunai = findViewById(R.id.TV_saldo_tunai);
        TVMetode = findViewById(R.id.metode);

        Number saldo = 50000;
        String saldoTopUpString = getIntent().getStringExtra("saldoTopUp");

        if (saldoTopUpString == null) {
            TVSaldo.setText("Rp " + saldo);
            TVSaldoTunai.setText(saldo.toString());
        } else {
            int saldoTopUpInt = Integer.valueOf(saldoTopUpString);
            Number hasil = saldoTopUpInt + 50000;
            TVSaldo.setText("Rp " + hasil);
            TVSaldoTunai.setText(hasil.toString());
        }

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

    public void keTukarPoin(View view) {
        startActivity(new Intent(SaldoActivity.this, TukarPointActivity.class));
    }

    public void keIsiSaldo(View view) {
        startActivity(new Intent(SaldoActivity.this, IsiSaldoActivity.class));
    }
}
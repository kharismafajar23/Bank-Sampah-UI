package com.demanganesia.banksampah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;

public class RequestPickupActivity extends AppCompatActivity {

    private int waktu_loading = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_pickup);
        //menghilangkan status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent keSuccesPickup = new Intent(RequestPickupActivity.this, SuccesPickupActivity.class);
                startActivity(keSuccesPickup);
                finish();
            }
        }, waktu_loading);
    }

    public void btn_kembali(View view) {
        startActivity(new Intent(RequestPickupActivity.this, JemputSampahActivity.class));
    }
}
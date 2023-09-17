package com.demanganesia.banksampah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class RequestPickupMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_pickup_map);
        //menghilangkan status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void kembali(View view) {
        onBackPressed();
    }

    public void keJemputSampah(View view) {
        startActivity(new Intent(RequestPickupMapActivity.this, Reg_Pickup_2_Activity.class));
        finish();
    }

    public void btn_batal(View view) {
        onBackPressed();
    }
}
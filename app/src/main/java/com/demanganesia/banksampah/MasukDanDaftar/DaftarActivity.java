package com.demanganesia.banksampah.MasukDanDaftar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.demanganesia.banksampah.MainActivity;
import com.demanganesia.banksampah.R;

public class DaftarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        //menghilangkan status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void Daftar(View view) {
        startActivity(new Intent(DaftarActivity.this, MainActivity.class));
        finish();
    }
}
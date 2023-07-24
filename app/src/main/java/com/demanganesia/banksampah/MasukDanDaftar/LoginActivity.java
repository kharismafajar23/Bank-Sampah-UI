package com.demanganesia.banksampah.MasukDanDaftar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.demanganesia.banksampah.R;

public class LoginActivity extends AppCompatActivity {

    TextView TVDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //menghilangkan status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TVDaftar = findViewById(R.id.TVDaftar);

        TVDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keDaftar = new Intent(LoginActivity.this, DaftarActivity.class);
                startActivity(keDaftar);
            }
        });
    }
}
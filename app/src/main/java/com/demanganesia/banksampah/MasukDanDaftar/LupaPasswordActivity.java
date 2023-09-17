package com.demanganesia.banksampah.MasukDanDaftar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.demanganesia.banksampah.R;

public class LupaPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password);
        //menghilangkan status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void forgetPassword(View view) {
        Toast.makeText(getApplicationContext(),"Silahkan cek email yang dimasukkan", Toast.LENGTH_SHORT).show();

        startActivity(new Intent(LupaPasswordActivity.this, LoginActivity.class));
        finish();
    }
}
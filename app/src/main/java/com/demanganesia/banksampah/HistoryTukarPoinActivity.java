package com.demanganesia.banksampah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class HistoryTukarPoinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_tukar_poin);
        //menghilangkan status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void kembali(View view) {
        onBackPressed();
    }

    public void keNotaHadiahAntar(View view) {
        startActivity(new Intent(this, NotaHadiahAntarActivity.class));
    }

    public void keAmbilSendiri(View view) {
        startActivity(new Intent(this, HistoryTukarPoinAmbilActivity.class));
        finish();
    }
}
package com.agasmf.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scorerujaktambah=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tambah3PointRujak(View view) {
        scorerujaktambah = scorerujaktambah + 3;
        TextView textViewRujak = findViewById(R.id.scorerujak);
        textViewRujak.setText(String.valueOf(scorerujaktambah));
    }

    }


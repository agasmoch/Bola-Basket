package com.agasmf.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scorerujaktambah=0;
    private int scoretumpengtambah=0;
    private int reset=0;


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

    public void tambah2pointrujak(View view) {
        scorerujaktambah = scorerujaktambah +2;
        TextView textViewRujak = findViewById(R.id.scorerujak);
        textViewRujak.setText(String.valueOf(scorerujaktambah));
    }

    public void tambah1pointrujak(View view) {
            scorerujaktambah = scorerujaktambah +1;
            TextView textViewRujak = findViewById(R.id.scorerujak);
            textViewRujak.setText(String.valueOf(scorerujaktambah));
    }

    public void tambah1pointtumpeng(View view) {
        scoretumpengtambah = scoretumpengtambah+1;
        TextView textViewTumpeng=findViewById(R.id.scoretumpeng);
        textViewTumpeng.setText(String.valueOf(scoretumpengtambah));
    }

    public void tambah2pointtumpeng(View view) {
        scoretumpengtambah = scoretumpengtambah+2;
        TextView textViewTumpeng=findViewById(R.id.scoretumpeng);
        textViewTumpeng.setText(String.valueOf(scoretumpengtambah));
    }

    public void tambah3pointtumpeng(View view) {
        scoretumpengtambah = scoretumpengtambah+3;
        TextView textViewTumpeng=findViewById(R.id.scoretumpeng);
        textViewTumpeng.setText(String.valueOf(scoretumpengtambah));
    }

    public void reset(View view) {
        reset=scorerujaktambah=0;
        reset=scoretumpengtambah=0;
        TextView textViewresettumpeng=findViewById(R.id.scoretumpeng);
        TextView textViewresetrujak=findViewById(R.id.scorerujak);
        textViewresettumpeng.setText(String.valueOf(reset));
        textViewresetrujak.setText(String.valueOf(reset));

    }
}


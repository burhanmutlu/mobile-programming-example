package com.example.ornekuygulama1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tv;
    TextView n;
    TextView renkKodlari;
    int count;


    public MainActivity() {
        count=0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.cevap);
        Button b= (Button) findViewById(R.id.cevapButon);
        n= (TextView) findViewById(R.id.basmaSayisi);
        renkKodlari = (TextView) findViewById(R.id.renkKodlari);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String sayi="#";
        count++;
        Random rand = new Random();
        for(int i=0; i<6; i++) {
            sayi += String.valueOf(rand.nextInt(10));
        }


        int myColor = Color.parseColor(sayi);
        tv.setText(R.string.bilmece_cevabi);
        n.setText(String.valueOf(count));
        tv.setTextColor(myColor);
        renkKodlari.setText(String.valueOf(sayi));


    }
}
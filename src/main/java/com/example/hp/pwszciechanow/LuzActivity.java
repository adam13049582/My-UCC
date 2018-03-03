package com.example.hp.pwszciechanow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LuzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luz);
    }

    public void biblioteka(View view){
        Intent intent=new Intent((LuzActivity.this),BibliotekaActivity.class);
        startActivity(intent);
    }

    public void kolo(View view){
        Intent intent=new Intent((LuzActivity.this),KolaActivity.class);
        startActivity(intent);
    }

    public void biuro_karier(View view){
        Intent intent=new Intent((LuzActivity.this),BiuroActivity.class);
        startActivity(intent);
    }

    public void sport(View view){
        Intent intent=new Intent((LuzActivity.this),SportActivity.class);
        startActivity(intent);
    }

    public void imprezy(View view){
        Intent intent=new Intent((LuzActivity.this),ImprezyActivity.class);
        startActivity(intent);
    }

}

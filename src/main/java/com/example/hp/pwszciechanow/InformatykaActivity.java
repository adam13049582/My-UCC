package com.example.hp.pwszciechanow;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class InformatykaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informatyka);

        View imView = findViewById(R.id.infa);
        ViewGroup.LayoutParams layoutParams = imView.getLayoutParams();
        //layoutParams.width="match parent";
        layoutParams.height = 3000;
        imView.setLayoutParams(layoutParams);

        ImageView imgView=(ImageView)findViewById(R.id.infa);
        imgView.setImageResource(R.drawable.zakladka_informatyka);
    }
}

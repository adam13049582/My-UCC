package com.example.hp.pwszciechanow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PlanActivity extends AppCompatActivity {

    int rok;
    String kierunek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);
    }
    public void informatykaI(View view){
        rok=1;
        kierunek="informatyka";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void informatykaII(View view){
        rok=2;
        kierunek="informatyka";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void informatykaIII(View view){
        rok=3;
        kierunek="informatyka";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void infIn(View view){
        rok=1;
        kierunek="informatykan";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void infIIn(View view){
        rok=2;
        kierunek="informatykan";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void infIIIn(View view){
        rok=3;
        kierunek="informatykan";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }

//mechanika---------------------------------------------------------------------------------------------------------------------------------
    public void mibmI(View view){
        rok=1;
        kierunek="mechanika";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void mibmII(View view){
        rok=2;
        kierunek="mechanika";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void mibmIII(View view){
        rok=3;
        kierunek="mechanika";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }



    public void mibmIn(View view){
        rok=1;
        kierunek="mechanikan";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void mibmIIn(View view){
        rok=2;
        kierunek="mechanikan";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void mibmIIIn(View view){
        rok=3;
        kierunek="mechanikan";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    //inżynieria środowiska ---------------------------------------------------------------------------------------------------------------------------------
    public void inzsI(View view){
        rok=1;
        kierunek="srodowisko";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void inzsII(View view){
        rok=2;
        kierunek="srodowisko";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void inzsIII(View view){
        rok=3;
        kierunek="srodowisko";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }


    //ekonomia---------------------------------------------------------------------------------------------------------------------------------
    public void ekonomiaI(View view){
        rok=1;
        kierunek="ekonomia";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void ekonomiaIIf(View view){
        rok=2;
        kierunek="ekonomiaf";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void ekonomiaIIa(View view){
        rok=2;
        kierunek="ekonomiaa";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void ekonomiaIIIf(View view){
        rok=3;
        kierunek="ekonomiaf";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void ekonomiaIIIa(View view){
        rok=3;
        kierunek="ekonomiaa";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }

    public void ekonomiaIn(View view){
        rok=1;
        kierunek="ekonomian";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void ekonomiaIIfn(View view){
        rok=2;
        kierunek="ekonomiafn";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void ekonomiaIIan(View view){
        rok=2;
        kierunek="ekonomiaan";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void ekonomiaIIIfn(View view){
        rok=3;
        kierunek="ekonomiafn";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void ekonomiaIIIan(View view){
        rok=3;
        kierunek="ekonomiaan";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }

    //rolnictwo---------------------------------------------------------------------------------------------------------------------------------
    public void rolnictwoI(View view){
        rok=1;
        kierunek="rolnictwo";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void rolnictwoII(View view){
        rok=2;
        kierunek="rolnictwo";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void rolnictwoIII(View view){
        rok=3;
        kierunek="rolnictwo";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }

    public void rolnictwoIsob(View view){
        rok=1;
        kierunek="rolnictwon";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void rolnictwoIIn(View view){
        rok=2;
        kierunek="rolnictwon";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }
    public void rolnictwoIIIn(View view){
        rok=3;
        kierunek="rolnictwon";
        Intent myintent=new Intent(PlanActivity.this, GPlanActivity.class).putExtra("kierunek", kierunek).putExtra("rok",rok); startActivity(myintent);
    }


}

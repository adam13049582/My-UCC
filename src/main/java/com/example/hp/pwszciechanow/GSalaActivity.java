package com.example.hp.pwszciechanow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class GSalaActivity extends AppCompatActivity {
    RelativeLayout back;
TextView opis;
    public static boolean zawiera (String [] arr, String item) {
        for (String n: arr) {
            if (item.compareToIgnoreCase(n)==0) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gsala);

        final String numereks = getIntent().getStringExtra("numers");
       final String[]parterlewo=getIntent().getStringArrayExtra("parterlewo");
        final String[]parterprawo=getIntent().getStringArrayExtra("parterprawo");
        final String[]Ipietrolewa=getIntent().getStringArrayExtra("Ipietrolewa");
        final String[]Ipietroprawa=getIntent().getStringArrayExtra("Ipietroprawa");
        final String[]IIpietrolewa=getIntent().getStringArrayExtra("IIpietrolewa");
        final String[]IIpietroprawa=getIntent().getStringArrayExtra("IIpietroprawa");
        final String[]IIpietrowprost=getIntent().getStringArrayExtra("IIpietrowprost");

        opis=(TextView)findViewById(R.id.osali);

        if(zawiera(parterlewo,numereks)==true){
           opis.setText("Sala nr. "+numereks+" znajduje się na parterze po lewej stronie."+"\r\n"+"Oto pełen spis sal w tej części budynku:");
            back=(RelativeLayout)findViewById(R.id.sale);
            back.setBackgroundResource(R.drawable.parterlewa);
        }
        if(zawiera(parterprawo,numereks)==true){
            opis.setText("Sala nr. "+numereks+" znajduje się na parterze po prawej stronie."+"\r\n"+"Oto pełen spis sal w tej części budynku:");
            back=(RelativeLayout)findViewById(R.id.sale);
            back.setBackgroundResource(R.drawable.parterprawa);
        }
        if(zawiera(Ipietrolewa,numereks)==true){
            opis.setText("Sala nr. "+numereks+" znajduje się na I piętrze po lewej stronie."+"\r\n"+"Oto pełen spis sal w tej części budynku:");
            back=(RelativeLayout)findViewById(R.id.sale);
            back.setBackgroundResource(R.drawable.pipietroprawa);
        }
        if(zawiera(Ipietroprawa,numereks)==true){
            opis.setText("Sala nr. "+numereks.toUpperCase()+" znajduje się na I piętrze po prawej stronie."+"\r\n"+"Oto pełen spis sal w tej części budynku:");
            back=(RelativeLayout)findViewById(R.id.sale);
            back.setBackgroundResource(R.drawable.pipietroprawa);
        }
        if(zawiera(IIpietrolewa,numereks)==true){
            opis.setText("Sala nr. "+numereks+" znajduje się na II piętrze po lewej stronie."+"\r\n"+"Oto pełen spis sal w tej części budynku:");
            back=(RelativeLayout)findViewById(R.id.sale);
            back.setBackgroundResource(R.drawable.dpietrolewa);
        }
        if(zawiera(IIpietroprawa,numereks)==true){
            opis.setText("Sala nr. "+numereks+" znajduje się na II piętrze po prawej stronie."+"\r\n"+"Oto pełen spis sal w tej części budynku:");
            back=(RelativeLayout)findViewById(R.id.sale);
            back.setBackgroundResource(R.drawable.dpietroprawa);
        }
        if(zawiera(IIpietrowprost,numereks)==true){
            opis.setText("Sala nr. "+numereks.toUpperCase()+" znajduje się na II piętrze na wprost schodów.");
            back=(RelativeLayout)findViewById(R.id.sale);
            back.setBackgroundResource(R.drawable.dpietrowprost);
        }
    }
}

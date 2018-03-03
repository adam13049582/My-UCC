package com.example.hp.pwszciechanow;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SalaActivity extends AppCompatActivity {


    EditText nrsal;
  String numers;
    String []parterlewo={"28","29","30","31","32"};
    String[]parterprawo={"1","2","5","7","9","10","14","15","16","17","18","19","21","25"};
    String[]Ipietrolewa={"102","103","104","105","107","108","109","110","111","114","116","129","131","135"};
    String[]Ipietroprawa={"118","119","121","122","123","124","125","126","127","128","137A"};
    String[]IIpietrolewa={"202","201","226","227","224","222"};
    String[]IIpietroprawa={"203","204","205","206","207","208","210","211","212","213","214","215","216","217","218","219","220","231","231A"};
   String[] IIpietrowprost={"202A"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_sala);

    }
    public static boolean zawiera (String [] arr, String item) {
        for (String n: arr) {
            if (item.compareToIgnoreCase(n)==0) {
                return true;
            }
        }
        return false;
    }
    public void wyszukaj(View view){
        nrsal=(EditText)findViewById(R.id.nrsali);
        Button szukajs=(Button)findViewById(R.id.wyszukaj);
        numers=nrsal.getText().toString();

       if(zawiera(parterlewo,numers)==false&&zawiera(parterprawo,numers)==false&&zawiera(Ipietrolewa,numers)==false&&zawiera(Ipietroprawa,numers)==false
               &&zawiera(IIpietrolewa,numers)==false&&zawiera(IIpietroprawa,numers)==false&&zawiera(IIpietrowprost,numers)==false) {
           AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
           dlgAlert.setMessage("Sala o podanym numerze nie istnieje lub informacje o niej są zastrzeżone");
           dlgAlert.setTitle("Niewłaściwy numer sali");
           dlgAlert.setPositiveButton("Ok",
                   new DialogInterface.OnClickListener() {
                       public void onClick(DialogInterface dialog, int which) {
                           //dismiss the dialog
                       }
                   });
           dlgAlert.setPositiveButton("OK", null);
           dlgAlert.setCancelable(true);

           dlgAlert.create().show();
       }else {
           Intent intent = new Intent((SalaActivity.this), GSalaActivity.class).putExtra("numers", numers).putExtra("parterlewo",parterlewo).putExtra("parterprawo",parterprawo)
                   .putExtra("Ipietrolewa",Ipietrolewa).putExtra("Ipietroprawa",Ipietroprawa).putExtra("IIpietrolewa",IIpietrolewa).putExtra("IIpietroprawa",IIpietroprawa).putExtra("IIpietrowprost",IIpietrowprost);
           startActivity(intent);
       }
    }
}

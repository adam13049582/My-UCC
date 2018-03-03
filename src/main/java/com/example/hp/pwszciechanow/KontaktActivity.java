package com.example.hp.pwszciechanow;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class KontaktActivity extends AppCompatActivity {
EditText temat,wiadomosc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontakt);

        temat=(EditText)findViewById(R.id.temat);
        wiadomosc=(EditText)findViewById(R.id.wiadomosc);
    }
    public void wyslij(View view){
        String adress="twojpwsz2017@gmail.com";
        String tematt=temat.getText().toString();
        temat.setText(tematt);
        String wiadomoscc=wiadomosc.getText().toString();
        wiadomosc.setText(wiadomoscc);


if(!tematt.matches("")&&!wiadomoscc.matches("")) {
    Intent intent= new Intent(Intent.ACTION_SEND);
    intent.setType("plain/text");

    intent.putExtra(Intent.EXTRA_EMAIL,new String[]{adress});
    intent.putExtra(Intent.EXTRA_SUBJECT,tematt);
    intent.putExtra(Intent.EXTRA_TEXT,wiadomoscc);
    startActivity(Intent.createChooser(intent, "Select Action"));
}else{
    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
    dlgAlert.setMessage("Nie podałeś tematu lub treści wiadomości. Uzupełnij puste pole i wyślij wiadomość.");
    dlgAlert.setTitle("Puste pole");
    dlgAlert.setPositiveButton("Ok",
            new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    //dismiss the dialog
                }
            });
    dlgAlert.setPositiveButton("OK", null);
    dlgAlert.setCancelable(true);

    dlgAlert.create().show();
}
    }
}

package com.example.hp.pwszciechanow;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class WyborActivity extends AppCompatActivity {
    boolean connected = false;
Button wiecej;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wybor);
        wiecej=(Button)findViewById(R.id.wiecej);

        wiecej.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                PopupMenu popupmenu = new PopupMenu(WyborActivity.this, wiecej);
                popupmenu.getMenuInflater().inflate(R.menu.popupmenu2, popupmenu.getMenu());

                popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {

                        String title = (String) item.getTitle();

                        if(title.compareToIgnoreCase("Przejdź do strony uczelni")==0){
                            goToUrl("http://www.pwszciechanow.edu.pl/");
                        }
                        if(title.compareToIgnoreCase("Autorzy")==0){
                            Intent intent = new Intent((WyborActivity.this), AutorzyActivity.class);
                            startActivity(intent);
                        }
                        if(title.compareToIgnoreCase("Organizacja roku akademickiego")==0){
                            Intent intent = new Intent((WyborActivity.this), TerminarzActivity.class);
                            startActivity(intent);
                        }
                        if(title.compareToIgnoreCase("Harmonogram zjazdów")==0){
                            Intent intent = new Intent((WyborActivity.this), HarmonogramActivity.class);
                            startActivity(intent);
                        }
                        if(title.compareToIgnoreCase("Kontakt")==0){
                            Intent intent = new Intent((WyborActivity.this), KontaktActivity.class);
                            startActivity(intent);
                        }
                        return true;
                    }
                });

                popupmenu.show();
            }
        });

    }


    public void sprInternet() {


    ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
    if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).

    getState() ==NetworkInfo.State.CONNECTED ||
            connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).

    getState() ==NetworkInfo.State.CONNECTED)

    {
        //we are connected to a network
        connected = true;
    }
    else
    connected =false;
}


    public void sesja(View view){
        sprInternet();
       // if(connected==true) {
            /*Intent intent = new Intent((WyborActivity.this), SesjaActivity.class);
            startActivity(intent);*/
       /* }
        else{*/
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("Ta zakładka jest na razie nieaktywna. Sesja letnia rozpocznie się 18 czerwca.");
            dlgAlert.setTitle("Nieaktywne");
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            //dismiss the dialog
                        }
                    });
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);

            dlgAlert.create().show();
      //  }
    }

    public void sala(View view){
        Intent intent=new Intent((WyborActivity.this),SalaActivity.class);
        startActivity(intent);
    }

    public void plan(View view){
        sprInternet();
        if(connected==true) {
            Intent intent = new Intent((WyborActivity.this), PlanActivity.class);
            startActivity(intent);
        }else{
           AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage("Aby sprawdzić plan zajęć musisz mieć połączenie z Internetem");
            dlgAlert.setTitle("Brak połączenia z Internetem");
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

    public void informatyka(View view){
        Intent intent=new Intent((WyborActivity.this),InformatykaActivity.class);
        startActivity(intent);
    }

    public void luz(View view){
       Intent intent=new Intent((WyborActivity.this),LuzActivity.class);
        startActivity(intent);
       // goToUrl ( "http://www.pwszciechanow.edu.pl/");
}

    public void kierunek(View view){
        Intent intent=new Intent((WyborActivity.this),KierunkiActivity.class);
        startActivity(intent);
    }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}

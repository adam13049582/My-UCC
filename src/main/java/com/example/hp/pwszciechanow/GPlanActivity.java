package com.example.hp.pwszciechanow;

import android.annotation.SuppressLint;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class GPlanActivity extends AppCompatActivity {
    // These matrices will be used to move and zoom image
    Button dzienb;
    RelativeLayout back;
    FirebaseStorage storage;
    StorageReference pathReferencepon,pathReferencewt,pathReferencesr,pathReferenceczw,pathReferencepiat,pathReferencesob,pathReferenceniedz;
    StorageReference storageRef;
    Drawable plan;
    TextView wolne;
    String title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_gplan);

        final String k = getIntent().getStringExtra("kierunek");
        final int r = getIntent().getIntExtra("rok", 0);

        storage = FirebaseStorage.getInstance();
        storageRef = storage.getReference ();

        back=(RelativeLayout)findViewById(R.id.tlo);
wolne=(TextView)findViewById(R.id.wolne);
        dzienb = (Button) findViewById(R.id.dzien);
dzienb.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View view) {

        PopupMenu popupmenu = new PopupMenu(GPlanActivity.this, dzienb);
        popupmenu.getMenuInflater().inflate(R.menu.popupmenu, popupmenu.getMenu());

        popupmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @SuppressLint("NewApi")
            public boolean onMenuItemClick(MenuItem item) {

                title= (String) item.getTitle();
                //Toast.makeText(GPlanActivity.this, " " + title, Toast.LENGTH_SHORT).show();
                dzienb.setText(title);

                if(k.compareToIgnoreCase("informatyka")==0&&r==1){
                    pathReferencepon = storageRef.child ("plany/Informatyka/STACJONARNE/inf1pon.png");
                    pathReferencewt = storageRef.child ("plany/Informatyka/STACJONARNE/inf1wt.png");
                    pathReferencesr = storageRef.child ("plany/Informatyka/STACJONARNE/inf1sr.png");
                    pathReferenceczw = storageRef.child ("plany/Informatyka/STACJONARNE/inf1czw.png");
                    pathReferencepiat = storageRef.child ("plany/Informatyka/STACJONARNE/inf1pia.png");

                    if(title.compareToIgnoreCase("Poniedziałek")==0){
                        FromFirebase(pathReferencepon);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Wtorek")==0){
                        FromFirebase(pathReferencewt);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Środa")==0){
                        FromFirebase(pathReferencesr);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Czwartek")==0){
                        FromFirebase(pathReferenceczw);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }

                if(k.compareToIgnoreCase("informatyka")==0&&r==2){
                    pathReferencepon = storageRef.child ("plany/Informatyka/STACJONARNE/inf2pon.png");
                    pathReferencewt = storageRef.child ("plany/Informatyka/STACJONARNE/inf2wt.png");
                    pathReferencesr = storageRef.child ("plany/Informatyka/STACJONARNE/inf2sr.png");
                    pathReferenceczw = storageRef.child ("plany/Informatyka/STACJONARNE/inf2czw.png");
                    pathReferencepiat = storageRef.child ("plany/Informatyka/STACJONARNE/inf2pia.png");

                    if(title.compareToIgnoreCase("Poniedziałek")==0){
                        FromFirebase(pathReferencepon);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Wtorek")==0){
                        FromFirebase(pathReferencewt);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Środa")==0){
                        FromFirebase(pathReferencesr);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Czwartek")==0){
                        FromFirebase(pathReferenceczw);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Sobota")==0){
                        FromFirebase(pathReferencesob);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }

                if(k.compareToIgnoreCase("informatyka")==0&&r==3){
                    pathReferencepon = storageRef.child ("plany/Informatyka/STACJONARNE/inf3pon.png");
                    pathReferencewt = storageRef.child ("plany/Informatyka/STACJONARNE/inf3wt.png");
                    pathReferencesr = storageRef.child ("plany/Informatyka/STACJONARNE/inf3sr.png");
                    pathReferenceczw = storageRef.child ("plany/Informatyka/STACJONARNE/inf3czw.png");
                    pathReferencepiat = storageRef.child ("plany/Informatyka/STACJONARNE/inf3pia.png");
                    pathReferencesob = storageRef.child ("plany/Informatyka/STACJONARNE/inf3sob.png");
                    pathReferenceniedz = storageRef.child ("plany/Informatyka/STACJONARNE/inf3niedz.png");

                    if(title.compareToIgnoreCase("Poniedziałek")==0){
                        FromFirebase(pathReferencepon);
                        wolne.setText("");
                }
               else if(title.compareToIgnoreCase("Wtorek")==0){
                            FromFirebase(pathReferencewt);
                            wolne.setText("");
                }
                else if(title.compareToIgnoreCase("Środa")==0){
                            FromFirebase(pathReferencesr);
                            wolne.setText("");
                }
                else if(title.compareToIgnoreCase("Czwartek")==0){
                    Toast.makeText(GPlanActivity.this, " " + title, Toast.LENGTH_SHORT).show();
                            FromFirebase(pathReferenceczw);
                            wolne.setText("");
                }
                else if(title.compareToIgnoreCase("Piątek")==0){
                            FromFirebase(pathReferencepiat);
                            wolne.setText("");}
                        else if(title.compareToIgnoreCase("Sobota")==0){
                            FromFirebase(pathReferencesob);
                            wolne.setText("");}
                        else if(title.compareToIgnoreCase("Niedziela")==0){
                            FromFirebase(pathReferenceniedz);
                            wolne.setText("");}
                }
                if(k.compareToIgnoreCase("informatykan")==0&&r==1){
                    pathReferencesob = storageRef.child ("plany/Informatyka/NIESTACJONARNE/infn1sob.png");
                    pathReferenceniedz = storageRef.child ("plany/Informatyka/NIESTACJONARNE/infn1niedz.png");

                    if(title.compareToIgnoreCase("Sobota")==0){
                        FromFirebase(pathReferencesob);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Niedziela")==0){
                        FromFirebase(pathReferenceniedz);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }
                if(k.compareToIgnoreCase("informatykan")==0&&r==2){
                    pathReferencesob = storageRef.child ("plany/Informatyka/NIESTACJONARNE/infn2sob.png");
                    pathReferenceniedz = storageRef.child ("plany/Informatyka/NIESTACJONARNE/infn2niedz.png");

                    if(title.compareToIgnoreCase("Sobota")==0){
                        FromFirebase(pathReferencesob);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Niedziela")==0){
                        FromFirebase(pathReferenceniedz);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }
                if(k.compareToIgnoreCase("informatykan")==0&&r==3){
                    pathReferencesob = storageRef.child ("plany/Informatyka/NIESTACJONARNE/infn3sob.png");
                    pathReferenceniedz = storageRef.child ("plany/Informatyka/NIESTACJONARNE/infn3niedz.png");

                    if(title.compareToIgnoreCase("Sobota")==0){
                        FromFirebase(pathReferencesob);
                        wolne.setText("");}
                   else if(title.compareToIgnoreCase("Niedziela")==0){
                        FromFirebase(pathReferenceniedz);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }
//mechanika--------------------------------------------------------------------------------------------------------------
                if(k.compareToIgnoreCase("mechanika")==0&&r==1){
                    pathReferencepon = storageRef.child ("plany/Mechanika/STACJONARNE/mechanika1pon.png");
                    pathReferencewt = storageRef.child ("plany/Mechanika/STACJONARNE/mechanika1wt.png");
                    pathReferencesr = storageRef.child ("plany/Mechanika/STACJONARNE/mechanika1sr.png");
                    pathReferenceczw = storageRef.child ("plany/Mechanika/STACJONARNE/mechanika1czw.png");
                    pathReferencepiat = storageRef.child ("plany/Mechanika/STACJONARNE/mechanika1pia.png");
                    pathReferencesob = storageRef.child ("plany/Mechanika/STACJONARNE/mechanika1sob.png");
                    pathReferenceniedz = storageRef.child ("plany/Mechanika/STACJONARNE/mechanika1niedz.png");

                    if(title.compareToIgnoreCase("Poniedziałek")==0){
                        FromFirebase(pathReferencepon);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Wtorek")==0){
                        FromFirebase(pathReferencewt);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Środa")==0){
                        FromFirebase(pathReferencesr);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Czwartek")==0){
                        FromFirebase(pathReferenceczw);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Sobota")==0){
                        FromFirebase(pathReferencesob);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Niedziela")==0){
                        FromFirebase(pathReferenceniedz);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }

                if(k.compareToIgnoreCase("mechanika")==0&&r==2){
                    pathReferencepon = storageRef.child ("plany/Mechanika/STACJONARNE/mechanika2pon.png");
                    pathReferencewt = storageRef.child ("plany/Mechanika/STACJONARNE/mechanika2wt.png");
                    pathReferencesr = storageRef.child ("plany/Mechanika/STACJONARNE/mechanika2sr.png");
                    pathReferenceczw = storageRef.child ("plany/Mechanika/STACJONARNE/mechanika2czw.png");
                    pathReferencepiat = storageRef.child ("plany/Mechanika/STACJONARNE/mechanika2pia.png");

                    if(title.compareToIgnoreCase("Poniedziałek")==0){
                        FromFirebase(pathReferencepon);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Wtorek")==0){
                        FromFirebase(pathReferencewt);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Środa")==0){
                        FromFirebase(pathReferencesr);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Czwartek")==0){
                        FromFirebase(pathReferenceczw);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }

                if(k.compareToIgnoreCase("mechanika")==0&&r==3){
                    pathReferencepon = storageRef.child ("plany/Mechanika/STACJONARNE/mechanika3pon.png");
                    pathReferencewt = storageRef.child ("plany/Mechanika/STACJONARNE/mechanika3wt.png");
                    pathReferencesr = storageRef.child ("plany/Mechanika/STACJONARNE/mechanika3sr.png");
                    pathReferenceczw = storageRef.child ("plany/Mechanika/STACJONARNE/mechanika3czw.png");
                    pathReferencepiat = storageRef.child ("plany/Mechanika/STACJONARNE/mechanika3pia.png");

                    if(title.compareToIgnoreCase("Poniedziałek")==0){
                        FromFirebase(pathReferencepon);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Wtorek")==0){
                        FromFirebase(pathReferencewt);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Środa")==0){
                        FromFirebase(pathReferencesr);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Czwartek")==0){
                        FromFirebase(pathReferenceczw);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }
                if(k.compareToIgnoreCase("mechanikan")==0&&r==1){

                    pathReferencesob = storageRef.child ("plany/Mechanika/NIESTACJONARNE/mechanikan1sob.png");
                    pathReferenceniedz = storageRef.child ("plany/Mechanika/NIESTACJONARNE/mechanikan1niedz.png");

                    if(title.compareToIgnoreCase("Sobota")==0){
                        FromFirebase(pathReferencesob);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Niedziela")==0){
                        FromFirebase(pathReferenceniedz);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }
                if(k.compareToIgnoreCase("mechanikan")==0&&r==2){
                    pathReferencepiat = storageRef.child ("plany/Mechanika/NIESTACJONARNE/mechanikan2pia.png");
                    pathReferencesob = storageRef.child ("plany/Mechanika/NIESTACJONARNE/mechanikan2sob.png");
                    pathReferenceniedz = storageRef.child ("plany/Mechanika/NIESTACJONARNE/mechanikan2niedz.png");

                    if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Sobota")==0){
                        FromFirebase(pathReferencesob);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Niedziela")==0){
                        FromFirebase(pathReferenceniedz);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }

                if(k.compareToIgnoreCase("mechanikan")==0&&r==3){
                    pathReferencepiat = storageRef.child ("plany/Mechanika/NIESTACJONARNE/mechanikan3pia.png");
                    pathReferencesob = storageRef.child ("plany/Mechanika/NIESTACJONARNE/mechanikan3sob.png");
                    pathReferenceniedz = storageRef.child ("plany/Mechanika/NIESTACJONARNE/mechanikan3niedz.png");

                    if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Sobota")==0){
                        FromFirebase(pathReferencesob);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Niedziela")==0){
                        FromFirebase(pathReferenceniedz);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }
                ///ekonomia ---------------------------------------------------------------------------------------------------------------------------------
                if(k.compareToIgnoreCase("ekonomia")==0&&r==1){
                    pathReferencepon = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomia1pon.png");
                    pathReferencewt = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomia1wt.png");
                    pathReferencesr = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomia1sr.png");
                    pathReferenceczw = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomia1czw.png");
                    pathReferencepiat = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomia1pia.png");

                    if(title.compareToIgnoreCase("Poniedziałek")==0){
                        FromFirebase(pathReferencepon);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Wtorek")==0){
                        FromFirebase(pathReferencewt);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Środa")==0){
                        FromFirebase(pathReferencesr);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Czwartek")==0){
                        FromFirebase(pathReferenceczw);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }

                if(k.compareToIgnoreCase("ekonomiaf")==0&&r==2){
                    pathReferencepon = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaf2pon.png");
                    pathReferencewt = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaf2wt.png");
                    pathReferencesr = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaf2sr.png");
                    pathReferenceczw = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaf2czw.png");
                    pathReferencepiat = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaf2pia.png");

                    if(title.compareToIgnoreCase("Poniedziałek")==0){
                        FromFirebase(pathReferencepon);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Wtorek")==0){
                        FromFirebase(pathReferencewt);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Środa")==0){
                        FromFirebase(pathReferencesr);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Czwartek")==0){
                        FromFirebase(pathReferenceczw);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }
                if(k.compareToIgnoreCase("ekonomiaa")==0&&r==2){
                    pathReferencepon = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaa2pon.png");
                    pathReferencewt = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaa2wt.png");
                    pathReferencesr = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaa2sr.png");
                    pathReferenceczw = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaa2czw.png");
                    pathReferencepiat = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaa2pia.png");

                    if(title.compareToIgnoreCase("Poniedziałek")==0){
                        FromFirebase(pathReferencepon);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Wtorek")==0){
                        FromFirebase(pathReferencewt);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Środa")==0){
                        FromFirebase(pathReferencesr);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Czwartek")==0){
                        FromFirebase(pathReferenceczw);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }

                if(k.compareToIgnoreCase("ekonomiaf")==0&&r==3){
                    pathReferencepon = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaf3pon.png");
                    pathReferencewt = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaf3wt.png");
                    pathReferencesr = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaf3sr.png");
                    pathReferenceczw = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaf3czw.png");
                    pathReferencepiat = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaf3pia.png");

                    if(title.compareToIgnoreCase("Poniedziałek")==0){
                        FromFirebase(pathReferencepon);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Wtorek")==0){
                        FromFirebase(pathReferencewt);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Środa")==0){
                        Toast.makeText(GPlanActivity.this, " " + title, Toast.LENGTH_SHORT).show();
                        FromFirebase(pathReferencesr);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Czwartek")==0){
                        FromFirebase(pathReferenceczw);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }
                if(k.compareToIgnoreCase("ekonomiaa")==0&&r==3){
                    pathReferencepon = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaa3pon.png");
                    pathReferencewt = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaa3wt.png");
                    pathReferencesr = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaa3sr.png");
                    pathReferenceczw = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaa3czw.png");
                    pathReferencepiat = storageRef.child ("plany/Ekonomia/STACJONARNE/ekonomiaa3pia.png");

                    if(title.compareToIgnoreCase("Poniedziałek")==0){
                        FromFirebase(pathReferencepon);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Wtorek")==0){
                        FromFirebase(pathReferencewt);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Środa")==0){
                        FromFirebase(pathReferencesr);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Czwartek")==0){
                        FromFirebase(pathReferenceczw);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }
                if(k.compareToIgnoreCase("ekonomian")==0&&r==1){
                    pathReferencepiat = storageRef.child ("plany/Ekonomia/NIESTACJONARNE/ekonomian1pia.png");
                    pathReferencesob = storageRef.child ("plany/Ekonomia/NIESTACJONARNE/ekonomian1sob.png");
                    pathReferenceniedz = storageRef.child ("plany/Ekonomia/NIESTACJONARNE/ekonomian1niedz.png");

                    if(title.compareToIgnoreCase("Piatek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Sobota")==0){
                        FromFirebase(pathReferencesob);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Niedziela")==0){
                        FromFirebase(pathReferenceniedz);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }

                if(k.compareToIgnoreCase("ekonomiafn")==0&&r==2){
                    pathReferencepiat = storageRef.child ("plany/Ekonomia/NIESTACJONARNE/ekonomiafn2pia.png");
                    pathReferencesob = storageRef.child ("plany/Ekonomia/NIESTACJONARNE/ekonomiafn2sob.png");
                    pathReferenceniedz = storageRef.child ("plany/Ekonomia/NIESTACJONARNE/ekonomiafn2niedz.png");

                    if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Sobota")==0){
                        FromFirebase(pathReferencesob);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Niedziela")==0){
                        FromFirebase(pathReferenceniedz);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }
                if(k.compareToIgnoreCase("ekonomiaan")==0&&r==2){
                    pathReferencepiat = storageRef.child ("plany/Ekonomia/NIESTACJONARNE/ekonomiaan2pia.png");
                    pathReferencesob = storageRef.child ("plany/Ekonomia/NIESTACJONARNE/ekonomiaan2sob.png");
                    pathReferenceniedz = storageRef.child ("plany/Ekonomia/NIESTACJONARNE/ekonomiaan2niedz.png");

                    if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                                wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Sobota")==0){
                        FromFirebase(pathReferencesob);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Niedziela")==0){
                        FromFirebase(pathReferenceniedz);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }

                if(k.compareToIgnoreCase("ekonomiafn")==0&&r==3){
                    pathReferencepiat = storageRef.child ("plany/Ekonomia/NIESTACJONARNE/ekonomiafn3pia.png");
                    pathReferencesob = storageRef.child ("plany/Ekonomia/NIESTACJONARNE/ekonomiafn3sob.png");
                    pathReferenceniedz = storageRef.child ("plany/Ekonomia/NIESTACJONARNE/ekonomiafn3niedz.png");

                    if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Sobota")==0){
                        FromFirebase(pathReferencesob);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Niedziela")==0){
                        FromFirebase(pathReferenceniedz);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }
                if(k.compareToIgnoreCase("ekonomiaan")==0&&r==3){
                    pathReferencepiat = storageRef.child ("plany/Ekonomia/NIESTACJONARNE/ekonomiaan3pia.png");
                    pathReferencesob = storageRef.child ("plany/Ekonomia/NIESTACJONARNE/ekonomiaan3sob.png");
                    pathReferenceniedz = storageRef.child ("plany/Ekonomia/NIESTACJONARNE/ekonomiaan3niedz.png");

                    if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Sobota")==0){
                        FromFirebase(pathReferencesob);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Niedziela")==0){
                        FromFirebase(pathReferenceniedz);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }
                ///inżynieria środowiska ---------------------------------------------------------------------------------------------------------------------------------
                if(k.compareToIgnoreCase("srodowisko")==0&&r==1){
                    pathReferencepon = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria1pon.png");
                    pathReferencewt = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria1wt.png");
                    pathReferencesr = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria1sr.png");
                    pathReferenceczw = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria1czw.png");
                    pathReferencepiat = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria1pia.png");
                    pathReferencesob = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria1sob.png");
                    pathReferenceniedz = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria1niedz.png");

                    if(title.compareToIgnoreCase("Poniedziałek")==0){
                        FromFirebase(pathReferencepon);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Wtorek")==0){
                        FromFirebase(pathReferencewt);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Środa")==0){
                        FromFirebase(pathReferencesr);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Czwartek")==0){
                        FromFirebase(pathReferenceczw);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Sobota")==0){
                        FromFirebase(pathReferencesob);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Niedziela")==0){
                        FromFirebase(pathReferenceniedz);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }

                if(k.compareToIgnoreCase("srodowisko")==0&&r==2){
                    pathReferencepon = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria2pon.png");
                    pathReferencewt = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria2wt.png");
                    pathReferencesr = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria2sr.png");
                    pathReferenceczw = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria2czw.png");
                    pathReferencepiat = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria2pia.png");

                    if(title.compareToIgnoreCase("Poniedziałek")==0){
                        FromFirebase(pathReferencepon);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Wtorek")==0){
                        FromFirebase(pathReferencewt);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Środa")==0){
                        FromFirebase(pathReferencesr);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Czwartek")==0){
                        FromFirebase(pathReferenceczw);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }

                if(k.compareToIgnoreCase("srodowisko")==0&&r==3){
                    pathReferencepon = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria3pon.png");
                    pathReferencewt = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria3wt.png");
                    pathReferencesr = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria3sr.png");
                    pathReferenceczw = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria3czw.png");
                    pathReferencepiat = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria3pia.png");
                    pathReferencesob = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria1sob.png");
                    pathReferenceniedz = storageRef.child ("plany/Inżynieria/STACJONARNE/inzynieria1niedz.png");

                    if(title.compareToIgnoreCase("Poniedziałek")==0){
                        FromFirebase(pathReferencepon);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Wtorek")==0){
                        FromFirebase(pathReferencewt);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Środa")==0){
                        FromFirebase(pathReferencesr);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Czwartek")==0){
                        FromFirebase(pathReferenceczw);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Sobota")==0){
                        FromFirebase(pathReferencesob);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Niedziela")==0){
                        FromFirebase(pathReferenceniedz);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }

                }
//Rolnictwo------------------------------------------------------------------------------------------------------------------------------------
                if(k.compareToIgnoreCase("rolnictwo")==0&&r==1){
                    pathReferencepon = storageRef.child ("plany/Rolnictwo/STACJONARNE/rolnictwo1pon.png");
                    pathReferencewt = storageRef.child ("plany/Rolnictwo/STACJONARNE/rolnictwo1wt.png");
                    pathReferencesr = storageRef.child ("plany/Rolnictwo/STACJONARNE/rolnictwo1sr.png");
                    pathReferenceczw = storageRef.child ("plany/Rolnictwo/STACJONARNE/rolnictwo1czw.png");
                    pathReferencepiat = storageRef.child ("plany/Rolnictwo/STACJONARNE/rolnictwo1pia.png");

                    if(title.compareToIgnoreCase("Poniedziałek")==0){
                        FromFirebase(pathReferencepon);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Wtorek")==0){
                        FromFirebase(pathReferencewt);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Środa")==0){
                        FromFirebase(pathReferencesr);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Czwartek")==0){
                        FromFirebase(pathReferenceczw);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }

                if(k.compareToIgnoreCase("rolnictwo")==0&&r==2){
                    pathReferencepon = storageRef.child ("plany/Rolnictwo/STACJONARNE/rolnictwo2pon.png");
                    pathReferencewt = storageRef.child ("plany/Rolnictwo/STACJONARNE/rolnictwo2wt.png");
                    pathReferencesr = storageRef.child ("plany/Rolnictwo/STACJONARNE/rolnictwo2sr.png");
                    pathReferenceczw = storageRef.child ("plany/Rolnictwo/STACJONARNE/rolnictwo2czw.png");
                    pathReferencepiat = storageRef.child ("plany/Rolnictwo/STACJONARNE/rolnictwo2pia.png");

                    if(title.compareToIgnoreCase("Poniedziałek")==0){
                        FromFirebase(pathReferencepon);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Wtorek")==0){
                        FromFirebase(pathReferencewt);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Środa")==0){
                        FromFirebase(pathReferencesr);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Czwartek")==0){
                        FromFirebase(pathReferenceczw);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");}

                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }

                if(k.compareToIgnoreCase("rolnictwo")==0&&r==3){
                    pathReferencepon = storageRef.child ("plany/Rolnictwo/STACJONARNE/rolnictwo3pon.png");
                    pathReferencewt = storageRef.child ("plany/Rolnictwo/STACJONARNE/rolnictwo3wt.png");
                    pathReferencesr = storageRef.child ("plany/Rolnictwo/STACJONARNE/rolnictwo3sr.png");
                    pathReferenceczw = storageRef.child ("plany/Rolnictwo/STACJONARNE/rolnictwo3czw.png");
                    pathReferencepiat = storageRef.child ("plany/Rolnictwo/STACJONARNE/rolnictwo3pia.png");

                    if(title.compareToIgnoreCase("Poniedziałek")==0){
                        FromFirebase(pathReferencepon);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Wtorek")==0){
                        FromFirebase(pathReferencewt);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Środa")==0){
                        FromFirebase(pathReferencesr);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Czwartek")==0){
                        FromFirebase(pathReferenceczw);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }

                if(k.compareToIgnoreCase("rolnictwon")==0&&r==1){
                    pathReferencesob = storageRef.child ("plany/Rolnictwo/NIESTACJONARNE/rolnictwon1sob.png");
                    pathReferenceniedz = storageRef.child ("plany/Rolnictwo/NIESTACJONARNE/rolnictwon1niedz.png");

                    if(title.compareToIgnoreCase("Sobota")==0){
                        FromFirebase(pathReferencesob);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Niedziela")==0){
                        FromFirebase(pathReferenceniedz);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }
                if(k.compareToIgnoreCase("rolnictwon")==0&&r==2){
                    pathReferencepiat = storageRef.child ("plany/Rolnictwo/NIESTACJONARNE/rolnictwon2pia.png");
                    pathReferencesob = storageRef.child ("plany/Rolnictwo/NIESTACJONARNE/rolnictwon2sob.png");
                    pathReferenceniedz = storageRef.child ("plany/Rolnictwo/NIESTACJONARNE/rolnictwon2niedz.png");

                    if(title.compareToIgnoreCase("Piątek")==0){
                        FromFirebase(pathReferencepiat);
                        wolne.setText("");
                    }
                    else if(title.compareToIgnoreCase("Sobota")==0){
                        FromFirebase(pathReferencesob);
                        wolne.setText("");}
                    else if(title.compareToIgnoreCase("Niedziela")==0){
                        FromFirebase(pathReferenceniedz);
                        wolne.setText("");}
                    else{
                        back.setBackgroundResource(R.drawable.wolne);
                        wolne.setText("Wolne");
                    }
                }
                    if(k.compareToIgnoreCase("rolnictwon")==0&&r==3){
                        pathReferencepiat = storageRef.child ("plany/Rolnictwo/NIESTACJONARNE/rolnictwon3pia.png");
                        pathReferencesob = storageRef.child ("plany/Rolnictwo/NIESTACJONARNE/rolnictwon3sob.png");
                        pathReferenceniedz = storageRef.child ("plany/Rolnictwo/NIESTACJONARNE/rolnictwon3niedz.png");

                        if(title.compareToIgnoreCase("Sobota")==0){
                            FromFirebase(pathReferencesob);
                            wolne.setText("");}
                        else if(title.compareToIgnoreCase("Niedziela")==0){
                            FromFirebase(pathReferenceniedz);
                            wolne.setText("");}
                        else{
                            back.setBackgroundResource(R.drawable.wolne);
                            wolne.setText("Wolne");
                        }
                }
                Toast.makeText(GPlanActivity.this, " " + title, Toast.LENGTH_SHORT).show();
                return true;
            }
        });


        popupmenu.show();
    }
});

        }
        public void FromFirebase(StorageReference sf){
            try {
                final long ONE_MEGABYTE = 1024 * 1024*2;
                sf.getBytes(ONE_MEGABYTE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
                    @SuppressLint("NewApi")
                    @Override
                    public void onSuccess(byte[] bytes) {
                        plan= new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bytes, 0, bytes.length));
                        back.setBackground(plan);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                    }
                });
            } catch (Exception e) {
                Log.e("Tu jest błąd", "Explanation of what was being attempted", e);
            }
        }
    }


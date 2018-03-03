package com.example.hp.pwszciechanow;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class SportActivity extends AppCompatActivity {
Drawable sport;
    FirebaseStorage storage;
    StorageReference pathReference;
    StorageReference storageRef;
    RelativeLayout back;
    ProgressBar spinner;
    boolean connected=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);
        storage = FirebaseStorage.getInstance();
        storageRef = storage.getReference ();
        pathReference = storageRef.child ("sport/sport.png");

        back=(RelativeLayout)findViewById(R.id.tlo);
        spinner=(ProgressBar)findViewById(R.id.spinner);
        spinner.getIndeterminateDrawable().setColorFilter(0xFFFF0000, android.graphics.PorterDuff.Mode.MULTIPLY);

        sprInternet();
        if(connected==false){
            Toast.makeText(SportActivity.this, "Aby wyświetlić zawartość musisz mieć połączenie z internetem " , Toast.LENGTH_LONG).show();
        }
        try {
            final long ONE_MEGABYTE = 1024 * 1024*2;
            pathReference.getBytes(ONE_MEGABYTE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
                @SuppressLint("NewApi")
                @Override
                public void onSuccess(byte[] bytes) {
                   sport= new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bytes, 0, bytes.length));
                    back.setBackground(sport);
                    spinner.setVisibility(View.GONE);
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
    public void sprInternet() {


        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).

                getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).

                        getState() ==NetworkInfo.State.CONNECTED)

        {
            //we are connected to a network
            connected = true;
        }
        else
            connected =false;
    }
}

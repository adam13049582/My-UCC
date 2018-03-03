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

//https://translate.google.pl/translate?hl=pl&sl=en&u=https://firebase.google.com/docs/storage/android/upload-files&prev=search


public class ImprezyActivity extends AppCompatActivity {
RelativeLayout imprezy;
    FirebaseStorage storage;
    StorageReference pathReference;
    StorageReference storageRef;
    Drawable image;
ProgressBar spinner;
    boolean connected = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imprezy);

        imprezy = (RelativeLayout) findViewById(R.id.imprezy);


spinner=(ProgressBar)findViewById(R.id.spinner);
        spinner.getIndeterminateDrawable().setColorFilter(0xFFFF0000, android.graphics.PorterDuff.Mode.MULTIPLY);

        sprInternet();
      if(connected==false){
          Toast.makeText(ImprezyActivity.this, "Aby wyświetlić zawartość musisz mieć połączenie z internetem " , Toast.LENGTH_LONG).show();
      }

        Thread thread = new Thread(new Runnable() {

            final String TAG = "Tu jest kurwa błąd";



            @Override
            public void run() {
                storage = FirebaseStorage.getInstance();

                // Utwórz odwołanie z początkową ścieżką i nazwą pliku
               storageRef = storage.getReference ();

                 pathReference = storageRef.child ("imprezy/imprezy.png");

                // Utwórz odwołanie do pliku z identyfikatora URI usługi Google Cloud Storage
                LoadImageFromWebOperations(pathReference);
            }

            public void LoadImageFromWebOperations(StorageReference gsReference) {
                try {

                    final long ONE_MEGABYTE = 1024 * 1024*2;
                    gsReference.getBytes(ONE_MEGABYTE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
                        @SuppressLint("NewApi")
                        @Override
                        public void onSuccess(byte[] bytes) {
                             image = new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bytes, 0, bytes.length));

                            imprezy.setBackground(image);
                            spinner.setVisibility(View.GONE);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception exception) {
                            // Handle any errors
                        }
                    });
                } catch (Exception e) {
                    Log.e(TAG, "Explanation of what was being attempted", e);
                }
            }
        });
        thread.start();
      // imprezy.getChildCount();
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

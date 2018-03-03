package com.example.hp.pwszciechanow;

import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import android.widget.ScrollView;

public class KolaActivity extends AppCompatActivity {
ImageView tlo;
    Matrix matrix=new Matrix();
    Float scale=1f;
    ScaleGestureDetector SGD;
ScrollView scroll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kola);
        tlo=(ImageView)findViewById(R.id.koloa);
      /*  scroll=(ScrollView)findViewById(R.id.scroll);
        SGD=new ScaleGestureDetector(this,new ScaleListener());*/

    }

    /*private  class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener{
        @Override
        public boolean onScale(ScaleGestureDetector detector){
            scale=scale*detector.getScaleFactor();
            scale=Math.max(0.1f,Math.min(scale,5f));
            matrix.setScale(scale,scale);
            tlo.setImageMatrix(matrix);
            return true;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        SGD.onTouchEvent(event);
        return true;
    }*/
}

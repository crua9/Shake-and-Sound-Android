package com.techreviewsandhelp.shakeandsound;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by crua9 on 5/5/2015.
 */
public class Splash extends Activity{


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splash);

            final Context c = this;
            Thread time = new Thread(){
                public void run(){
                    try{
                        sleep(8000);

                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }finally {
                        Intent openStartingPoint = new Intent(c,MainActivity.class);
                        startActivity(openStartingPoint);
                    }
                }};
            time.start();
        }
        protected void onPause(){
            super.onPause();
            finish();
        }

    }


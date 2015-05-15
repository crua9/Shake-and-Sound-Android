package com.techreviewsandhelp.shakeandsound;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.Button;



public class MainActivity extends Activity  implements SensorEventListener{


    private Button Bdev, Bwork, Brandom, Bwhip, Bboom, Bgun, Bbig, Bbaby, Bmoney;

    private boolean inti;

    private float x1, x2, x3;
    /*
    for whatever reason, Android Studio doesn't seem to have the Shake Detector on it.
    So, I think I have to use an older method.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // define

        SensorManager SM = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        if (SM.getSensorList(Sensor.TYPE_ACCELEROMETER).size() != 0) ;
        Sensor s = SM.getSensorList(Sensor.TYPE_ACCELEROMETER).get(0);
        SM.registerListener(this, s, SensorManager.SENSOR_DELAY_NORMAL);

    }
    public void onAccuracyChanged(Sensor arg0, int arg1){}

    public void onSensorChanged(SensorEvent e){

        float x,y,z;
        x = e.values[0];
        y = e.values[1];
        z = e.values[2];

        if (!inti) {
            x1 = x;
            x2 = y;
            x3 = z;
            inti=true;
        } else {

        }
    }
}

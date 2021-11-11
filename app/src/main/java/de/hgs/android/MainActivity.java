package de.hgs.android;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private TextView tvX;
    private TextView tvY;
    private TextView tvZ;
    private SensorManager sm;
    private Sensor sensorAcc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView-Objekte referenzieren
        tvX = (TextView)findViewById(R.id.textViewX);
        tvY = (TextView)findViewById(R.id.textViewY);
        tvZ = (TextView)findViewById(R.id.textViewZ);
//Sernsormanager
        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
    }


    /**
     * dfgsdffdsgdg
     * @param event
     */
    @Override
    public void onSensorChanged(SensorEvent event) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
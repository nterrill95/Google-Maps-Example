package com.example.nickterrill.androidmapandlocationdemo;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onHelloMapsClick(View view){
        //boolean worked = true;

        Intent helloMapsIntent = new Intent(MainActivity.this, HelloMaps.class);
        //helloMapsIntent.putExtra("key", worked);
        MainActivity.this.startActivity(helloMapsIntent);
    }

    public void onMapStyleClick(View view){
        Intent myIntent = new Intent(MainActivity.this, MapStyle.class);
        MainActivity.this.startActivity(myIntent);
    }
}

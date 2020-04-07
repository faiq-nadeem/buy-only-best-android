package com.buyonlybest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("BUY ONLY BEST ITEM");

    }

    public void mobile_tablet(View view){
        Intent mobileActivity = new Intent(getBaseContext(),   MobileActivity.class);
        startActivity(mobileActivity);
    }


    public void laptop_gaming(View view){
        Intent featuresActivity = new Intent(getBaseContext(),   LaptopActivity.class);
        startActivity(featuresActivity);
    }

    public void pc_gaming(View view){
        Intent featuresActivity = new Intent(getBaseContext(),   LaptopActivity.class);
        startActivity(featuresActivity);
    }

    public void chat(View view){
        Intent featuresActivity = new Intent(getBaseContext(),   LaptopActivity.class);
        startActivity(featuresActivity);
    }

    public void support(View view){
        Intent featuresActivity = new Intent(getBaseContext(),   LaptopActivity.class);
        startActivity(featuresActivity);
    }

    public void about(View view){
        Intent featuresActivity = new Intent(getBaseContext(),   LaptopActivity.class);
        startActivity(featuresActivity);
    }

    public void other_apps(View view){
        Intent featuresActivity = new Intent(getBaseContext(),   LaptopActivity.class);
        startActivity(featuresActivity);
    }


}

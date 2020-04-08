package com.buyonlybest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.MyAlertDialog);
        builder.setTitle("ARE YOU SURE, YOU WANT TO EXIT?");
        builder.setMessage("If you need any please Contact Us!");
        builder.setNegativeButton("NEED HELP", null);
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
            }

        }).show();

        
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
        Intent featuresActivity = new Intent(getBaseContext(),   ChatActivity.class);
        startActivity(featuresActivity);
    }


    public void about(View view){
        Intent aboutActivity = new Intent(getBaseContext(),   AboutActivity.class);
        startActivity(aboutActivity);
    }

    public void other_apps(View view){
        Intent featuresActivity = new Intent(getBaseContext(),   MoreActivity.class);
        startActivity(featuresActivity);
    }

    public void exit_app(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.MyAlertDialog);
        builder.setTitle("ARE YOU SURE, YOU WANT TO EXIT?");
        builder.setMessage("If you need any please Contact Us!");
        builder.setNegativeButton("NEED HELP", null);
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
            }

        }).show();
    }


}

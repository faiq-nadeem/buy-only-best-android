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

    public void mobile(View view){
        setTitle("MOBILE");
        Intent featuresActivity = new Intent(getBaseContext(),   FeatureActivity.class);
        startActivity(featuresActivity);
    }

    public void tablet(View view){
        setTitle("TABLET");
        Intent featuresActivity = new Intent(getBaseContext(),   FeatureActivity.class);
        startActivity(featuresActivity);

    }

    public void laptop(View view){
        setTitle("LAPTOP");
        Intent featuresActivity = new Intent(getBaseContext(),   FeatureActivity.class);
        startActivity(featuresActivity);

    }

    public void pc(View view){
        setTitle("PC / GAMING PC");
        Intent featuresActivity = new Intent(getBaseContext(),   FeatureActivity.class);
        startActivity(featuresActivity);

    }
}

package com.example.gardeninventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ToContinueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_continue);
    }

    public void addMore(View view){
        Intent plantsPage = new Intent(this, PickPlantsActivity.class);
        startActivity(plantsPage);

    }

    public void doneAtGarden(View view){
        Intent locationsPage = new Intent(this, PickLocationActivity.class);
        startActivity(locationsPage);

    }

    public void doneHarvesting(View view){
        Intent homePage = new Intent(this, MainActivity.class);
        startActivity(homePage);

    }
}
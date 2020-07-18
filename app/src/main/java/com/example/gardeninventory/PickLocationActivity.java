package com.example.gardeninventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PickLocationActivity extends AppCompatActivity {

    Boolean gouin, cp, medtronic, cummins = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_location);
    }

    public void pickPlantsAtGouin(View view){
        Intent plantsPage = new Intent(this, PickPlantsActivity.class);
        startActivity(plantsPage);
        gouin = true;
    }

    public void pickPlantsAtCP(View view){
        Intent plantsPage = new Intent(this, PickPlantsActivity.class);
        startActivity(plantsPage);
        cp = true;
    }

    public void pickPlantsAtCummins(View view){
        Intent plantsPage = new Intent(this, PickPlantsActivity.class);
        startActivity(plantsPage);
        cummins = true;
    }

    public void pickPlantsAtMedtronic(View view){
        Intent plantsPage = new Intent(this, PickPlantsActivity.class);
        startActivity(plantsPage);
        medtronic = true;
    }

}
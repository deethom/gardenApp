package com.example.gardeninventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 * @author  David Thomas
 * @version 1.2
 * @since   2020-07-22
 */
public class PickLocationActivity extends AppCompatActivity {
    private static GardenState currentGarden = GardenState.NULL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_location);
    }

//each button on this page has a method call below. Depending on which button is pressed, it will set the GardenState enum type, and move to the next page.

    public void pickPlantsAtGouin(View view){
        ((MyApplication) this.getApplication()).setCurrentGarden(GardenState.GOUIN);
        Intent plantsPage = new Intent(this, PickPlantsActivity.class);
        startActivity(plantsPage);


    }

    public void pickPlantsAtCP(View view){
        ((MyApplication) this.getApplication()).setCurrentGarden(GardenState.CP);
        Intent plantsPage = new Intent(this, PickPlantsActivity.class);
        startActivity(plantsPage);

    }

    public void pickPlantsAtCummins(View view){
        ((MyApplication) this.getApplication()).setCurrentGarden(GardenState.CUMMINS);
        Intent plantsPage = new Intent(this, PickPlantsActivity.class);
        startActivity(plantsPage);

    }

    public void pickPlantsAtMedtronic(View view){
        ((MyApplication) this.getApplication()).setCurrentGarden(GardenState.MEDTRONIC);
        Intent plantsPage = new Intent(this, PickPlantsActivity.class);
        startActivity(plantsPage);

    }


}
package com.example.gardeninventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
/**
 * @author  David Thomas
 * @version 1.2
 * @since   2020-07-22
 */
public class ToContinueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_continue);
        TextView plantTxt,qtyTxt,gardenTxt;
        plantTxt = (TextView) findViewById(R.id.plant);
        qtyTxt = (TextView) findViewById(R.id.qty);
        gardenTxt = (TextView) findViewById(R.id.garden);

            //prints what you have just added to inventory
        qtyTxt.setText(((MyApplication) this.getApplication()).getAmt());
        plantTxt.setText(((MyApplication) this.getApplication()).getPlant());
        gardenTxt.setText(((MyApplication) this.getApplication()).getGarden());

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
package com.example.gardeninventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PickPlantsActivity extends AppCompatActivity {

    private static PlantState currentPlant = PlantState.NULL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_plants);
    }

    public void pickKale(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        ((MyApplication) this.getApplication()).setCurrentPlant(PlantState.KALE);
    }

    public void pickLettuce(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        ((MyApplication) this.getApplication()).setCurrentPlant(PlantState.LETTUCE);
    }

    public void pickCherryTomatoes(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        ((MyApplication) this.getApplication()).setCurrentPlant(PlantState.CHERRY_TOMATOES);
    }

    public void pickRoundTomatoes(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        ((MyApplication) this.getApplication()).setCurrentPlant(PlantState.ROUND_TOMATOES);
    }

    public void pickZucchinni(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        ((MyApplication) this.getApplication()).setCurrentPlant(PlantState.ZUCCHINNI);
    }

    public void pickCucumber(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        ((MyApplication) this.getApplication()).setCurrentPlant(PlantState.CUCUMBER);
    }

    public void pickBeans(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        ((MyApplication) this.getApplication()).setCurrentPlant(PlantState.BEANS);
    }

    public void pickBrocoli(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        ((MyApplication) this.getApplication()).setCurrentPlant(PlantState.BROCOLI);
    }

    public void pickCauliflower(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        ((MyApplication) this.getApplication()).setCurrentPlant(PlantState.CAULIFLOWER);
    }

    public void pickBasil(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        ((MyApplication) this.getApplication()).setCurrentPlant(PlantState.BASIL);
    }

    public void pickChives(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        ((MyApplication) this.getApplication()).setCurrentPlant(PlantState.CHIVES);
    }

    public void pickCoriander(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        ((MyApplication) this.getApplication()).setCurrentPlant(PlantState.CORIANDER);
    }

}
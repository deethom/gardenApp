package com.example.gardeninventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PickPlantsActivity extends AppCompatActivity {

    Boolean kale,lettuce,cherry_tomatoes,round_tomatoes,zucchinni,cucumber,beans,brocoli,cauliflower,basil,chives,coriander = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_plants);
    }

    public void pickKale(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        kale = true;
    }

    public void pickLettuce(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        lettuce = true;
    }

    public void pickCherryTomatoes(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        cherry_tomatoes = true;
    }

    public void pickRoundTomatoes(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        round_tomatoes = true;
    }

    public void pickZucchinni(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        zucchinni = true;
    }

    public void pickCucumber(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        cucumber = true;
    }

    public void pickBeans(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        beans = true;
    }

    public void pickBrocoli(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        brocoli = true;
    }

    public void pickCauliflower(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        cauliflower = true;
    }

    public void pickBasil(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        basil = true;
    }

    public void pickChives(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        chives = true;
    }

    public void pickCoriander(View view){
        Intent quantPage = new Intent(this, EnterAmountActivity.class);
        startActivity(quantPage);
        coriander = true;
    }
}
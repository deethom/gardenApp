package com.example.gardeninventory;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pickLocation(View view){
        Intent locationsPage = new Intent(this, PickLocationActivity.class);
        startActivity(locationsPage);
    }

    public void viewInventory(View view){
        Intent inventoryPage = new Intent(this, ViewInventoryActivity.class);

        startActivity(inventoryPage);
    }
}
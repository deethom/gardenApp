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
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //takes user to page to pick location
    public void pickLocation(View view){
        Intent locationsPage = new Intent(this, PickLocationActivity.class);
        startActivity(locationsPage);
    }
    //takes user to inventory page
    public void viewInventory(View view){
        Intent inventoryPage = new Intent(this, ViewInventoryActivity.class);

        startActivity(inventoryPage);
    }
}
package com.example.gardeninventory;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



/**
 * @author  David Thomas
 * @version 1.2
 * @since   2020-07-22
 */

public class EnterAmountActivity extends AppCompatActivity {
    //java instances of xml elements present
    String plant, amt, garden;
    TextView edttxt;
    Button button_1, button_2, button_3, button_4,button_5,button_6,button_7,button_8,button_9,button_0,button_clear,button_add;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_amount);
        edttxt = (TextView) findViewById(R.id.screen);
        button_0 = (Button) findViewById(R.id.button_0);
        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        button_4 = (Button) findViewById(R.id.button_4);
        button_5 = (Button) findViewById(R.id.button_5);
        button_6 = (Button) findViewById(R.id.button_6);
        button_7 = (Button) findViewById(R.id.button_7);
        button_8 = (Button) findViewById(R.id.button_8);
        button_9 = (Button) findViewById(R.id.button_9);
        button_clear = (Button) findViewById(R.id.button_clear);
        button_add = (Button) findViewById(R.id.button_add);



        //when a number button is pressed, it is displayed on the Textview with id "screen". before every button press checkPlusSign() is called. This method controls visibility of the "+" button

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"0");
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPlusSign();
                edttxt.setText(edttxt.getText()+"1");
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPlusSign();
                edttxt.setText(edttxt.getText()+"2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPlusSign();
                edttxt.setText(edttxt.getText()+"3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPlusSign();
                edttxt.setText(edttxt.getText()+"4");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPlusSign();
                edttxt.setText(edttxt.getText()+"5");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPlusSign();
                edttxt.setText(edttxt.getText()+"6");
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPlusSign();
                edttxt.setText(edttxt.getText()+"7");
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPlusSign();
                edttxt.setText(edttxt.getText()+"8");
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPlusSign();
                edttxt.setText(edttxt.getText()+"9");
            }
        });
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText("");
                button_add.setVisibility(View.INVISIBLE);
            }
        });
    }

    //method that stores the current qty, plant, and garden in the array lists in MyApplication.java
    public void add(View view){
        //gets garden state and defines string value
        GardenState currentGarden = ((MyApplication) this.getApplication()).getCurrentGarden();
        switch (currentGarden){
            case GOUIN: garden = "GOUIN";
                break;
            case CP: garden = "CP";
                break;
            case MEDTRONIC: garden = "MED";
                break;
            case CUMMINS: garden = "CUMMINS";
                break;
        }
    //gets plant state and defines string value
        PlantState currentPlant = ((MyApplication) this.getApplication()).getCurrentPlant();
        switch (currentPlant){
            case KALE: plant = "KALE";
                break;
            case LETTUCE: plant = "LETTUCE";
                break;
            case CHERRY_TOMATOES: plant = "CH.TOMATO";
                break;
            case ROUND_TOMATOES: plant = "R.TOMATO";
                break;
            case ZUCCHINNI: plant = "ZUCCHINNI";
                break;
            case CUCUMBER: plant = "CUCUMBER";
                break;
            case BEANS: plant = "BEAN";
                break;
            case BROCOLI: plant = "BROCCOLI";
                break;
            case CAULIFLOWER: plant = "CAULIFLOWER";
                break;
            case BASIL: plant = "BASIL";
                break;
            case CHIVES: plant = "CHIVE";
                break;
            case CORIANDER: plant = "CORIANDER";
                break;
        }

        //gets string value for amount
        amt = (String) edttxt.getText();


//adds all of these variables to MyApplication.java class variables
       ((MyApplication) this.getApplication()).setAmt(amt);

        ((MyApplication) this.getApplication()).addPlants(plant);
        ((MyApplication) this.getApplication()).addGardens(garden);
        ((MyApplication) this.getApplication()).addAmts(amt);

        //message for plural or singular bags, displayed on next page
        String s;
        if (Integer.parseInt(amt) > 1){
            s = amt+" BAGS OF\n"+plant+"\nadded to "+garden;
        }
        else{
            s = amt+" BAG OF\n"+plant+"\nadded to "+garden;
        }

        ((MyApplication) this.getApplication()).setMessage(s);
        Intent finish = new Intent(this, ToContinueActivity.class);
        startActivity(finish);
    }

    //checks whether or not to display "+" sign on qty page, if it is blank or == 0
    public void checkPlusSign(){
        amt = (String) edttxt.getText();
        if (amt.equals("")){
            button_add.setVisibility(View.VISIBLE);
        }
        else{
            if (Integer.parseInt(amt) != 0){
                button_add.setVisibility(View.VISIBLE);

            }
        }
    }

    }







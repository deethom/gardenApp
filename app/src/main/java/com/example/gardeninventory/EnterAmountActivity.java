package com.example.gardeninventory;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.Output;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;


import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class EnterAmountActivity extends AppCompatActivity {
    String plant, amt, garden;
    TextView edttxt;
    Button button_1, button_2, button_3, button_4,button_5,button_6,button_7,button_8,button_9,button_0,button_clear;





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

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"0");
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"1");
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"4");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"5");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"6");
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"7");
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"8");
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText(edttxt.getText()+"9");
            }
        });
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edttxt.setText("");
            }
        });
    }
    public void add(View view){
        GardenState currentGarden = ((MyApplication) this.getApplication()).getCurrentGarden();
        switch (currentGarden){
            case GOUIN: garden = "GOUIN";
                break;
            case CP: garden = "CP";
                break;
            case MEDTRONIC: garden = "MEDTRONIC";
                break;
            case CUMMINS: garden = "CUMMINS";
                break;
        }

        PlantState currentPlant = ((MyApplication) this.getApplication()).getCurrentPlant();
        switch (currentPlant){
            case NULL: garden = "FOUND IT";break;
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
            case BEANS: plant = "BEANS";
                break;
            case BROCOLI: plant = "BROCOLI";
                break;
            case CAULIFLOWER: plant = "CAULIFLOWER";
                break;
            case BASIL: plant = "BASIL";
                break;
            case CHIVES: plant = "CHIVES";
                break;
            case CORIANDER: plant = "CORIANDER";
                break;
        }
        amt = (String) edttxt.getText();

/*
        try {
            InputStream inputStream = new FileInputStream("inventory.xls");
            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(0);
            Cell cell = row.getCell(0);
            if (cell == null){
                cell = row.createCell(0);
            }
            cell.setCellType(CellType.STRING);
            cell.setCellValue("a test");
            OutputStream fileOut = new FileOutputStream("inventory.xls");
            workbook.write(fileOut);
        }




        catch(Exception e){};*/

       // ((MyApplication) this.getApplication()).setAmt(amt);

        ((MyApplication) this.getApplication()).addPlants(plant);
        ((MyApplication) this.getApplication()).addGardens(garden);
        ((MyApplication) this.getApplication()).addAmts(amt);








        Intent finish = new Intent(this, ToContinueActivity.class);



        startActivity(finish);
    }

    }







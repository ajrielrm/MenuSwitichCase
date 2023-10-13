package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewPrice;
    private EditText editTextQuantity, editTextMenu;
    int total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewPrice = findViewById(R.id.total);
        editTextMenu = findViewById(R.id.inputmenu);
        editTextQuantity = findViewById(R.id.inputjumlah);
        Button buttonCalculate = findViewById(R.id.buttonjumlah);

            buttonCalculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String test = "Pilih 1-4";
                    String priceText;
                    String quantityText = editTextQuantity.getText().toString();
                    int quantity = Integer.parseInt(quantityText);
                     priceText = editTextMenu.getText().toString();

                    switch (priceText) {
                        case "1":
                            total = 20000;
                            break;

                        case "2":
                            total = 15000;
                            break;

                        case "3":
                            total = 15000;
                            break;

                        case "4":
                            total = 5000;
                            break;

                        default:
                             test = "Pilih 1-4";
                    }




                    // Calculate the total
                   int hasil = total * quantity;

                    // Display the result in the textViewResult
                    textViewPrice.setText("Total: " + hasil );
                }


        });
}}
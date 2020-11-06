package com.example.resistorassignment_ronan_finnegan_duffy_s00187127;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Get fields off view
    public static Spinner band1Spinner;
    public static Spinner band2Spinner;
    public static Spinner bandMultiplier;
    public static Spinner bandTolerance;
    public static ImageView ivBand1, ivBand2, ivBandMultiplier, ivBandTolerance;
    public static TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the spinners accessible in the java code
        band1Spinner = findViewById(R.id.band1Spinner);
        band2Spinner = findViewById(R.id.band2Spinner);
        bandMultiplier = findViewById(R.id.multiplierSpinner);
        bandTolerance = findViewById(R.id.toleranceSpinner);

        ivBand1 = findViewById(R.id.bandOne);
        ivBand2 = findViewById(R.id.bandTwo);
        ivBandMultiplier = findViewById(R.id.bandMultiplier);
        ivBandTolerance = findViewById(R.id.bandTolerance);

        tvAnswer = findViewById(R.id.tvAnswer);

        // Create an array adaptor for the first two spinners
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.band_colors_array, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Create an array adaptor for the multiplier spinner
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.band_multiplier_array, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Create an array adaptor for the tolerance spinner
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.band_tolerance_array, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Set it to the two first spinners
        band1Spinner.setAdapter(adapter1);
        band2Spinner.setAdapter(adapter1);
        // Set the two spinners accordingly
        bandMultiplier.setAdapter(adapter2);
        bandTolerance.setAdapter(adapter3);

        band1Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = parent.getItemAtPosition(position).toString();
                switch (text) {
                    case "Black":
                        ivBand1.setImageDrawable(null);
                        ivBand1.setBackgroundResource(R.drawable.black);
                        break;
                    case "Brown":
                        ivBand1.setImageDrawable(null);
                        ivBand1.setBackgroundResource(R.drawable.brown);
                        break;
                    case "Red":
                        ivBand1.setImageDrawable(null);
                        ivBand1.setBackgroundResource(R.drawable.red);
                        break;
                    case "Orange":
                        ivBand1.setImageDrawable(null);
                        ivBand1.setBackgroundResource(R.drawable.orange);
                        break;
                    case "Yellow":
                        ivBand1.setImageDrawable(null);
                        ivBand1.setBackgroundResource(R.drawable.yellow);
                        break;
                    case "Green":
                        ivBand1.setImageDrawable(null);
                        ivBand1.setBackgroundResource(R.drawable.green);
                        break;
                    case "Blue":
                        ivBand1.setImageDrawable(null);
                        ivBand1.setBackgroundResource(R.drawable.blue);
                        break;
                    case "Violet":
                        ivBand1.setImageDrawable(null);
                        ivBand1.setBackgroundResource(R.drawable.violet);
                        break;
                    case "Grey":
                        ivBand1.setImageDrawable(null);
                        ivBand1.setBackgroundResource(R.drawable.grey);
                        break;
                    case "White":
                        ivBand1.setImageDrawable(null);
                        ivBand1.setBackgroundResource(R.drawable.white);
                        break;
                    default:
                        System.out.println("Default");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        band2Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = parent.getItemAtPosition(position).toString();
                switch (text) {
                    case "Black":
                        ivBand2.setImageDrawable(null);
                        ivBand2.setBackgroundResource(R.drawable.black);
                        break;
                    case "Brown":
                        ivBand2.setImageDrawable(null);
                        ivBand2.setBackgroundResource(R.drawable.brown);
                        break;
                    case "Red":
                        ivBand2.setImageDrawable(null);
                        ivBand2.setBackgroundResource(R.drawable.red);
                        break;
                    case "Orange":
                        ivBand2.setImageDrawable(null);
                        ivBand2.setBackgroundResource(R.drawable.orange);
                        break;
                    case "Yellow":
                        ivBand2.setImageDrawable(null);
                        ivBand2.setBackgroundResource(R.drawable.yellow);
                        break;
                    case "Green":
                        ivBand2.setImageDrawable(null);
                        ivBand2.setBackgroundResource(R.drawable.green);
                        break;
                    case "Blue":
                        ivBand2.setImageDrawable(null);
                        ivBand2.setBackgroundResource(R.drawable.blue);
                        break;
                    case "Violet":
                        ivBand2.setImageDrawable(null);
                        ivBand2.setBackgroundResource(R.drawable.violet);
                        break;
                    case "Grey":
                        ivBand2.setImageDrawable(null);
                        ivBand2.setBackgroundResource(R.drawable.grey);
                        break;
                    case "White":
                        ivBand2.setImageDrawable(null);
                        ivBand2.setBackgroundResource(R.drawable.white);
                        break;
                    default:
                        System.out.println("Default");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        bandMultiplier.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = parent.getItemAtPosition(position).toString();
                switch (text) {
                    case "Black":
                        ivBandMultiplier.setImageDrawable(null);
                        ivBandMultiplier.setBackgroundResource(R.drawable.black);
                        break;
                    case "Brown":
                        ivBandMultiplier.setImageDrawable(null);
                        ivBandMultiplier.setBackgroundResource(R.drawable.brown);
                        break;
                    case "Red":
                        ivBandMultiplier.setImageDrawable(null);
                        ivBandMultiplier.setBackgroundResource(R.drawable.red);
                        break;
                    case "Orange":
                        ivBandMultiplier.setImageDrawable(null);
                        ivBandMultiplier.setBackgroundResource(R.drawable.orange);
                        break;
                    case "Yellow":
                        ivBandMultiplier.setImageDrawable(null);
                        ivBandMultiplier.setBackgroundResource(R.drawable.yellow);
                        break;
                    case "Green":
                        ivBandMultiplier.setImageDrawable(null);
                        ivBandMultiplier.setBackgroundResource(R.drawable.green);
                        break;
                    case "Blue":
                        ivBandMultiplier.setImageDrawable(null);
                        ivBandMultiplier.setBackgroundResource(R.drawable.blue);
                        break;
                    case "Violet":
                        ivBandMultiplier.setImageDrawable(null);
                        ivBandMultiplier.setBackgroundResource(R.drawable.violet);
                        break;
                    case "Grey":
                        ivBandMultiplier.setImageDrawable(null);
                        ivBandMultiplier.setBackgroundResource(R.drawable.grey);
                        break;
                    case "Silver":
                        ivBandMultiplier.setImageDrawable(null);
                        ivBandMultiplier.setBackgroundResource(R.drawable.silver);
                        break;
                    case "Gold":
                        ivBandMultiplier.setImageDrawable(null);
                        ivBandMultiplier.setBackgroundResource(R.drawable.gold);
                        break;
                    case "White":
                        ivBandMultiplier.setImageDrawable(null);
                        ivBandMultiplier.setBackgroundResource(R.drawable.white);
                        break;
                    default:
                        System.out.println("Default");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        bandTolerance.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = parent.getItemAtPosition(position).toString();
                switch (text) {
                    case "Brown":
                        ivBandTolerance.setImageDrawable(null);
                        ivBandTolerance.setBackgroundResource(R.drawable.brown);
                        break;
                    case "Red":
                        ivBandTolerance.setImageDrawable(null);
                        ivBandTolerance.setBackgroundResource(R.drawable.red);
                        break;
                    case "Green":
                        ivBandTolerance.setImageDrawable(null);
                        ivBandTolerance.setBackgroundResource(R.drawable.green);
                        break;
                    case "Blue":
                        ivBandTolerance.setImageDrawable(null);
                        ivBandTolerance.setBackgroundResource(R.drawable.blue);
                        break;
                    case "Violet":
                        ivBandTolerance.setImageDrawable(null);
                        ivBandTolerance.setBackgroundResource(R.drawable.violet);
                        break;
                    case "Grey":
                        ivBandTolerance.setImageDrawable(null);
                        ivBandTolerance.setBackgroundResource(R.drawable.grey);
                        break;
                    case "Silver":
                        ivBandTolerance.setImageDrawable(null);
                        ivBandTolerance.setBackgroundResource(R.drawable.silver);
                        break;
                    case "Gold":
                        ivBandTolerance.setImageDrawable(null);
                        ivBandTolerance.setBackgroundResource(R.drawable.gold);
                        break;
                    default:
                        System.out.println("Default");
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public static void calculateAnswer(View view){
        int i = 0;
        int j = 0;
        double k = 0;
        String tolerance = "";
        // Get the string of a band1Spinner and to run through an if/else to set the value of the band
        String item1 = band1Spinner.getSelectedItem().toString();
        String item2 = band2Spinner.getSelectedItem().toString();
        String item3 = bandMultiplier.getSelectedItem().toString();
        String item4 = bandTolerance.getSelectedItem().toString();

        switch (item1){
            case "Black":
                i = 0;
                break;
            case "Brown":
                i = 1;
                break;
            case "Red":
                i = 2;
                break;
            case "Orange":
                i = 3;
                break;
            case "Yellow":
                i = 4;
                break;
            case "Green":
                i = 5;
                break;
            case "Blue":
                i = 6;
                break;
            case "Violet":
                i =7;
                break;
            case "Grey":
                i = 8;
                break;
            case "White":
                i = 9;
                break;
        }

        switch (item2){
            case "Black":
                j = 0;
                break;
            case "Brown":
                j = 1;
                break;
            case "Red":
                j = 2;
                break;
            case "Orange":
                j = 3;
                break;
            case "Yellow":
                j = 4;
                break;
            case "Green":
                j = 5;
                break;
            case "Blue":
                j = 6;
                break;
            case "Violet":
                j =7;
                break;
            case "Grey":
                j = 8;
                break;
            case "White":
                j = 9;
                break;
        }

        switch (item3){
            case "Black":
                k=1;
                break;
            case "Brown":
                k=10;
                break;
            case "Red":
                k=100;
                break;
            case "Orange":
                k=1000;
                break;
            case "Yellow":
                k=10000;
                break;
            case "Green":
                k=100000;
                break;
            case "Blue":
                k=1000000;
            case "Grey":
                k=10000000;
                break;
            case "White":
                k=100000000;
                break;
            case "Gold":
                k=0.1;
                break;
            case "Silver":
                k=0.01;
                break;
        }

        switch(item4){
            case "Brown":
                tolerance = "±1%";
                break;
            case "Red":
                tolerance = "±2%";
                break;
            case "Green":
                tolerance = "±0.5%";
                break;
            case "Blue":
                tolerance = "±0.25%";
                break;
            case "Violet":
                tolerance = "±0.1%";
                break;
            case "Gray":
                tolerance = "±0.05%";
                break;
            case "Gold":
                tolerance = "±5%";
                break;
            case "Silver":
                tolerance = "±10%";

        }
        String firstConcat = i + "" + j;
        double firstNumber = Double.parseDouble(firstConcat);
        double calculatedNumber = firstNumber * k;

        String calculatedAnswer = calculatedNumber + "";

        String finalAnswer = calculatedAnswer + " " + tolerance;
        tvAnswer.setText(finalAnswer);
        System.out.println(finalAnswer);
    }

    public static void resetValues(View view){
        int position = 0;
        ivBand1.setImageDrawable(null);
        ivBand1.setBackgroundResource(R.drawable.black);
        ivBand2.setImageDrawable(null);
        ivBand2.setBackgroundResource(R.drawable.black);
        ivBandMultiplier.setImageDrawable(null);
        ivBandMultiplier.setBackgroundResource(R.drawable.black);
        ivBandTolerance.setImageDrawable(null);
        ivBandTolerance.setBackgroundResource(R.drawable.brown);
        band1Spinner.setSelection(position);
        band2Spinner.setSelection(position);
        bandTolerance.setSelection(position);
        bandMultiplier.setSelection(position);
        tvAnswer.setText("");

    }
}


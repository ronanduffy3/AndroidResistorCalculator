package com.example.resistorassignment_ronan_finnegan_duffy_s00187127;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Get fields off view
    private Spinner band1Spinner, band2Spinner, bandMultiplier, bandTolerance;
    private ImageView ivBand1, ivBand2, ivBandMultiplier, ivBandTolerance;

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





    }



//    @Override
//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        String text = parent.getItemAtPosition(position).toString();
//        switch(text){
//            case "Black":
//                ivBand1.setImageDrawable(null);
//                ivBand1.setBackgroundResource(R.drawable.black);
//                break;
//            case "Brown":
//                ivBand1.setImageDrawable(null);
//                ivBand1.setBackgroundResource(R.drawable.brown);
//                break;
//            case "Red":
//                ivBand1.setImageDrawable(null);
//                ivBand1.setBackgroundResource(R.drawable.red);
//                break;
//            case "Orange":
//                ivBand1.setImageDrawable(null);
//                ivBand1.setBackgroundResource(R.drawable.orange);
//                break;
//            case "Yellow":
//                ivBand1.setImageDrawable(null);
//                ivBand1.setBackgroundResource(R.drawable.yellow);
//                break;
//            case "Green":
//                ivBand1.setImageDrawable(null);
//                ivBand1.setBackgroundResource(R.drawable.green);
//                break;
//            case "Blue":
//                ivBand1.setImageDrawable(null);
//                ivBand1.setBackgroundResource(R.drawable.blue);
//                break;
//            case "Violet":
//                ivBand1.setImageDrawable(null);
//                ivBand1.setBackgroundResource(R.drawable.violet);
//                break;
//            case "Grey":
//                ivBand1.setImageDrawable(null);
//                ivBand1.setBackgroundResource(R.drawable.grey);
//                break;
//            case "White":
//                ivBand1.setImageDrawable(null);
//                ivBand1.setBackgroundResource(R.drawable.white);
//                break;
//            default:
//                System.out.println("Default");
//        }
//
//        System.out.println(text);
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> parent) {
//
//    }
}


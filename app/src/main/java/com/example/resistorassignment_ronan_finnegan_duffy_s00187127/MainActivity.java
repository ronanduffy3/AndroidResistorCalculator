package com.example.resistorassignment_ronan_finnegan_duffy_s00187127;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    // Get fields off view


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the spinners accessible in the java code
        Spinner band1Spinner = (Spinner) findViewById(R.id.band1Spinner);
        Spinner band2Spinner = (Spinner) findViewById(R.id.band2Spinner);
        Spinner bandMultiplier = (Spinner) findViewById(R.id.multiplierSpinner);
        Spinner bandTolerance = (Spinner) findViewById(R.id.toleranceSpinner);

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
    }
}
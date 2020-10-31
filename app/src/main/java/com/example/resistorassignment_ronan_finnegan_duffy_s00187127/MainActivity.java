package com.example.resistorassignment_ronan_finnegan_duffy_s00187127;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    // Get fields off view
    private Spinner band1Spinner, band2Spinner, bandMultiplier, bandTolerance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the spinners accessible in the java code
        band1Spinner = findViewById(R.id.band1Spinner);
        band2Spinner = findViewById(R.id.band2Spinner);
        bandMultiplier = findViewById(R.id.multiplierSpinner);
        bandTolerance = findViewById(R.id.toleranceSpinner);

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

        band1Spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        System.out.println(text);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
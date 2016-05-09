package com.example.savio.sppusmartparkingsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class CheckAvailability extends AppCompatActivity {

    final String[] destinations = {

            "Department Of Computer Science",
            "Department Of Physics",
            "Department Of Chemistry",
            "Department Of Botany",
            "Department Of Geology",
            "Department Of Statistics",
            "Department Of Mathematics",
            "Department Of Information & Technology",
            "Department Of Sankskrit",
            "Canteen Adarsh",
            "Canteen Aniket",
            "Lalit Kalha Kendra",
            "C-DAC",
            "Main Building",
            "Jaikar Library",
            "SET Guest House",
            "IUCCA",
            "CINS"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_availability);

        final AutoCompleteTextView location = ( AutoCompleteTextView ) findViewById( R.id.autoCompleteTextView_check_avail_check );
        final Button check_avail = ( Button ) findViewById( R.id.button_check_avail );

        ArrayAdapter arrayAdapter = new ArrayAdapter( this, android.R.layout.select_dialog_item, destinations );
        location.setThreshold( 1 );
        location.setAdapter( arrayAdapter );

    }
}

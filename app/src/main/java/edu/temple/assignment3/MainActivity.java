package edu.temple.assignment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //using colors from android color class to make coding easier
        //11 colors in array
        final String[] colors = {"WHITE", "BLUE", "RED", "YELLOW", "GREEN", "NAVY", "OLIVE", "PURPLE", "TEAL", "MAGENTA","SILVER"};

        final Spinner spin;
        spin = findViewById(R.id.spinner);

        ColorAdapter adap = new ColorAdapter(this, colors);
        spin.setAdapter(adap);

        //for setting backround to different colors
        final ConstraintLayout cl = (ConstraintLayout) findViewById(R.id.constraintlay);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                cl.setBackgroundColor(Color.parseColor((String) colors[position]));//changes layout to selected color
                spin.setBackgroundColor(Color.WHITE);//sets view background to white
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                cl.setBackgroundColor(Color.WHITE);//case if nothing is selected

            }
        });






    }
}

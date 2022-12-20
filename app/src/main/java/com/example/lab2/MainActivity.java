package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        Switch switch1 = findViewById(R.id.switch1);
        CalendarView cal = new CalendarView(this);
        ConstraintLayout layout = findViewById(R.id.mainLayout);
        layout.addView(cal);
        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(switch1.isChecked()) {
                    button.setEnabled(true);
                    layout.removeView(cal);
                    Toast.makeText(MainActivity.this, "Button Enabled", Toast.LENGTH_SHORT).show();
                } else {
                    button.setEnabled(false);
                    layout.addView(cal);
                    Toast.makeText(MainActivity.this, "Button disables", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
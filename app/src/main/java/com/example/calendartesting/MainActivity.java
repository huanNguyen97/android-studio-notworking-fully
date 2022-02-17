package com.example.calendartesting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    // Initialize data
    CalendarView simpleCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize view's
        simpleCalendarView = findViewById(R.id.simpleCalendarView);

        // setting attribute for calendar
        simpleCalendarView.setFocusedMonthDateColor(Color.RED);
        simpleCalendarView.setUnfocusedMonthDateColor(Color.BLUE);
        simpleCalendarView.setSelectedWeekBackgroundColor(Color.RED);
        simpleCalendarView.setWeekSeparatorLineColor(Color.GREEN);

        // Perform onChange of calendar
        simpleCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(
                    getApplicationContext(),
                    dayOfMonth + "/" + month + "/" + year,
                    Toast.LENGTH_LONG
                ).show();
            }
        });
    }
}
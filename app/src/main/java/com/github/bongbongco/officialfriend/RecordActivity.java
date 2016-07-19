package com.github.bongbongco.officialfriend;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RecordActivity extends AppCompatActivity {

    long now = System.currentTimeMillis();
    Date date = new Date(now);
    SimpleDateFormat sdfNow = new SimpleDateFormat("HH:mm:ss");
    String formatDate = sdfNow.format(date);

    TextView dateNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        findViewById(R.id.movedCalendar).setOnClickListener(movedCalendarClickListener);
        findViewById(R.id.recordWorkTime).setOnClickListener(recordWordTimeClickListener);
        dateNow = (TextView) findViewById(R.id.dateNow);
        dateNow.setText(formatDate);
    }

    Button.OnClickListener movedCalendarClickListener = new View.OnClickListener() {
        public void onClick (View v) {
            Intent calendarActivityIntent = new Intent(RecordActivity.this, CalendarActivity.class);
            startActivity(calendarActivityIntent);
        }
    };

    Button.OnClickListener recordWordTimeClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), formatDate, Toast.LENGTH_SHORT).show();
        }
    };
}

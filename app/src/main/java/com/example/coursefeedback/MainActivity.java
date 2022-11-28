package com.example.coursefeedback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radio_btn1, radio_btn2, radio_btn3, radio_btn4, radio_btn5;
    Button next_btn, terms_btn, refresh_btn, home_btn;
    TextView app_name, appbar_title, refresh_text, terms_text, survey_question, poor, fair, good, very_good, excellent, next, grading, very_slow, slow, normal, fast, very_fast, overall_pace, overall_quality;
    ImageView gsu_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initializes button and on click, will send user to next activity
        terms_btn = (Button) findViewById(R.id.terms_btn);
        terms_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //tells the app to start new activity
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), selectCourse.class);
                startActivity(intent);
            }
        });
    }

}




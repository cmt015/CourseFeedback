package com.example.coursefeedback;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class multChoice_survey2 extends MainActivity{
    RadioGroup radioGroup2;
    Button next_btn2;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question2);

        radioGroup2 = findViewById(R.id.radioGroup2);
        next_btn2 = findViewById(R.id.next_btn);
        next_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int checkID = radioGroup2.getCheckedRadioButtonId();
                if(checkID == -1) {
                    showMsg.message(getApplicationContext(),"Please select an option.");
                }
                else {
                    findRadioButton(checkID);
                    Intent intent = new Intent(getApplicationContext(), multChoice_survey3.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void findRadioButton(int checkID) {
        switch (checkID) {
            case R.id.radio_btn1:
                break;
            case R.id.radio_btn2:
                break;
            case R.id.radio_btn3:
                break;
            case R.id.radio_btn4:
                break;
            case R.id.radio_btn5:
                break;
        }
    }

}


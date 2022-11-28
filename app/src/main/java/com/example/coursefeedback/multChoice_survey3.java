package com.example.coursefeedback;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class multChoice_survey3 extends MainActivity{

    RadioGroup radioGroup3;
    Button next_btn3;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question3);

        radioGroup3 = findViewById(R.id.radioGroup3);
        next_btn3 = findViewById(R.id.next_btn3);
        next_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int checkID = radioGroup3.getCheckedRadioButtonId();
                if(checkID == -1) {
                    //Radio buttons are not checked
                    showMsg.message(getApplicationContext(),"Please select an option.");
                }
                else {
                    findRadioButton(checkID);
                    Intent intent = new Intent(getApplicationContext(), openResponse.class);
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


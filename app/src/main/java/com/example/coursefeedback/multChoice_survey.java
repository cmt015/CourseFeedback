package com.example.coursefeedback;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class multChoice_survey extends MainActivity {

    RadioGroup radioGroup1;
    Button next_btn;
    int index;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);

        radioGroup1 = findViewById(R.id.radioGroup1);
        next_btn = findViewById(R.id.next_btn);
        next_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int checkID = radioGroup1.getCheckedRadioButtonId();
                if(checkID == -1) {
                    //if statement for when radio buttons are not checked
                    showMsg.message(getApplicationContext(),"Please select an option.");
                }
                //if radio buttons are checked, user will be able to navigate to next apge
                else {
                    findRadioButton(checkID);
                    Intent intent = new Intent(getApplicationContext(), multChoice_survey2.class);
                    startActivity(intent);
                }
            }
        });

    }
    //cases for radio buttons when clicked
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

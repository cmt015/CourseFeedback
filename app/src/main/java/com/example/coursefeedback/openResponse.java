package com.example.coursefeedback;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class openResponse extends MainActivity{

    String inputResponse;
    EditText questionInput;
    Button exit_btn, submit_btn;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question4);

        //initializes user input
        submit_btn = (Button) findViewById(R.id.submit_btn);
        exit_btn = (Button) findViewById(R.id.exit_btn);
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            //saves response as a string
            public void onClick(View v) {
                questionInput = (EditText) findViewById(R.id.openResponse);
                inputResponse = questionInput.getText().toString().trim();

        };
    });
    exit_btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }
     });
    }
}


package com.example.coursefeedback;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class submission extends MainActivity{

    Button home_btn;
    //this will put user on the submission page
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submission_page);

        //Home button initialized, once clicked, it will send the user back to the main screen

        home_btn = findViewById(R.id.exit_btn1);
        home_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
    }
}

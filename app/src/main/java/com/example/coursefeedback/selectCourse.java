package com.example.coursefeedback;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class selectCourse extends MainActivity implements AdapterView.OnItemSelectedListener {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_course);

        Spinner spinner = findViewById(R.id.menu);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.course_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        Button course_next;
        course_next = findViewById(R.id.course_next);
        course_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestions();
            }
        });
    }



    public void openQuestions() {
        Intent intent = new Intent(this, multChoice_survey.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String selected_course = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), selected_course, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
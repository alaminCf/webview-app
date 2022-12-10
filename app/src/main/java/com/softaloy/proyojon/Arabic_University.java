package com.softaloy.proyojon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import soup.neumorphism.NeumorphCardView;

public class Arabic_University extends AppCompatActivity {

    NeumorphCardView iau_home, iau_admission, iau_exam, iau_result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arabic_university);

        iau_admission = findViewById(R.id.iau_admission);
        iau_exam = findViewById(R.id.iau_exam);
        iau_result = findViewById(R.id.iau_result);
        iau_home = findViewById(R.id.iau_home);


        iau_admission.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Iau_Admission.class)));
        iau_exam.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Iau_Exam.class)));
        iau_result.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Iau_Result.class)));
        iau_home.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Iau_Home.class)));



    }
}
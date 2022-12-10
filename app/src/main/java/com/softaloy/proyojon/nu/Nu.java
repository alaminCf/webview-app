package com.softaloy.proyojon.nu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.softaloy.proyojon.Nu_Home;
import com.softaloy.proyojon.R;

import soup.neumorphism.NeumorphCardView;

public class Nu extends AppCompatActivity {

    NeumorphCardView nu_home, nu_admission, nu_form_fillup, nu_exam, nu_result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nu);

        nu_admission = findViewById(R.id.nu_admission);
        nu_form_fillup = findViewById(R.id.nu_form_fillup);
        nu_exam = findViewById(R.id.nu_exam);
        nu_result = findViewById(R.id.nu_result);
        nu_home = findViewById(R.id.nu_home);



        nu_admission.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Nu_Admission.class)));
        nu_form_fillup.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Nu_Form.class)));
        nu_exam.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Nu_Exam.class)));
        nu_result.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Nu_Result.class)));
        nu_home.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Nu_Home.class)));



    }
}
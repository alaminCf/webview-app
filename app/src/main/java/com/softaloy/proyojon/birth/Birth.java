package com.softaloy.proyojon.birth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.softaloy.proyojon.R;

import soup.neumorphism.NeumorphCardView;

public class Birth extends AppCompatActivity {


    NeumorphCardView birth_new_reg, birth_search, birth_currection, birth_current_status, birth_print;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth);


        birth_new_reg = findViewById(R.id.birth_new_reg);
        birth_search = findViewById(R.id.birth_search);
        birth_currection = findViewById(R.id.birth_currection);
        birth_current_status = findViewById(R.id.birth_current_status);
        birth_print = findViewById(R.id.birth_print);


        birth_new_reg.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Birth_New_Reg.class)));
        birth_search.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Birth_Search.class)));
        birth_currection.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Birth_Correction.class)));
        birth_current_status.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Birth_Current_Status.class)));
        birth_print.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Birth_Print.class)));


    }

}
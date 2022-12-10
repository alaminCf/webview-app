package com.softaloy.proyojon.Admission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.softaloy.proyojon.R;
import com.softaloy.proyojon.birth.Birth_New_Reg;
import com.softaloy.proyojon.birth.Birth_Search;

import soup.neumorphism.NeumorphCardView;

public class Admission extends AppCompatActivity {

    NeumorphCardView birth_new_reg, birth_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission);

        birth_new_reg = findViewById(R.id.birth_new_reg);
        birth_search = findViewById(R.id.birth_search);

        birth_new_reg.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Medical_Admission.class)));
        birth_search.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Public_Admission.class)));


    }
}
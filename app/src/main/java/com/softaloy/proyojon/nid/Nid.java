package com.softaloy.proyojon.nid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.softaloy.proyojon.R;

import soup.neumorphism.NeumorphCardView;

public class Nid extends AppCompatActivity {

    NeumorphCardView nid_reg, nid_new_acc, nid_question, nirbachon_form;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nid);

        nid_reg = findViewById(R.id.nid_reg);
        nid_new_acc = findViewById(R.id.nid_new_acc);
        nid_question = findViewById(R.id.nid_question);
        nirbachon_form = findViewById(R.id.nirbachon_form);



        nid_reg.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Nid_Reg.class)));
        nid_new_acc.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Nid_New_Acc.class)));
        nid_question.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Nid_Question.class)));
        nirbachon_form.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Nirbachon_Form.class)));


    }
}
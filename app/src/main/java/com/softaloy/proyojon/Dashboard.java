package com.softaloy.proyojon;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.softaloy.proyojon.Admission.Admission;
import com.softaloy.proyojon.birth.Birth;
import com.softaloy.proyojon.nid.Nid;
import com.softaloy.proyojon.nu.Nu;

import soup.neumorphism.NeumorphCardView;

public class Dashboard extends AppCompatActivity {

    NeumorphCardView birth_reg, nid, passport, nu, bmeb, iau, bou, bd_all_result,
            bteb, brta, brtc, btrc, bcc, dyd, pcb, health, drug, ictd, brdb, breb, boesl, bmet, admission;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        birth_reg = findViewById(R.id.birth_reg);
        nid = findViewById(R.id.nid);
        passport = findViewById(R.id.passport);
        nu = findViewById(R.id.nu);
        bmeb = findViewById(R.id.bmeb);
        iau = findViewById(R.id.iau);
        bou = findViewById(R.id.bou);
        bd_all_result = findViewById(R.id.bd_all_result);
        bteb = findViewById(R.id.bteb);
        brta = findViewById(R.id.brta);
        brtc = findViewById(R.id.brtc);
        btrc = findViewById(R.id.btrc);
        bcc = findViewById(R.id.bcc);
        dyd = findViewById(R.id.dyd);
        pcb = findViewById(R.id.pcb);
        health = findViewById(R.id.health);
        drug = findViewById(R.id.drug);
        ictd = findViewById(R.id.ictd);
        brdb = findViewById(R.id.brdb);
        breb = findViewById(R.id.breb);
        boesl = findViewById(R.id.boesl);
        bmet = findViewById(R.id.bmet);
        admission = findViewById(R.id.admission);


        birth_reg.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, Birth.class);
            startActivity(intent);
        });
        nid.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, Nid.class);
            startActivity(intent);
        });
        passport.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, E_Passport.class);
            startActivity(intent);
        });
        nu.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, Nu.class);
            startActivity(intent);
        });
        bmeb.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, Madrasha.class);
            startActivity(intent);
        });
        iau.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, Arabic_University.class);
            startActivity(intent);
        });
        bou.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, Open_University.class);
            startActivity(intent);
        });
        bd_all_result.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, All_Result.class);
            startActivity(intent);
        });
        bteb.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, Bteb.class);
            startActivity(intent);
        });
        brta.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, Brta.class);
            startActivity(intent);
        });
        brtc.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, Brtc.class);
            startActivity(intent);
        });
        btrc.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, Btrc.class);
            startActivity(intent);
        });
        bcc.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, Computer.class);
            startActivity(intent);
        });
        dyd.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, DYD.class);
            startActivity(intent);
        });
        pcb.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, Pharmachy.class);
            startActivity(intent);
        });
        health.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, DGHS.class);
            startActivity(intent);
        });
        drug.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, DGDA.class);
            startActivity(intent);
        });
        ictd.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, ICTD.class);
            startActivity(intent);
        });
        brdb.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, BRDB.class);
            startActivity(intent);
        });
        breb.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, BREB.class);
            startActivity(intent);
        });
        boesl.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, Boesl.class);
            startActivity(intent);
        });
        bmet.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, BMET.class);
            startActivity(intent);
        });
        admission.setOnClickListener(view -> {
            Intent intent = new Intent(Dashboard.this, Admission.class);
            startActivity(intent);
        });

    }

    @Override
    public void onBackPressed() {
       /* if (webview.canGoBack()) {
            webview.goBack();
        }else {
        }*/
        ShowAlert();
    }

    private void ShowAlert() {

        AlertDialog.Builder builder = new AlertDialog.Builder(Dashboard.this);
        builder.setTitle("Exit!");
        builder.setMessage("Are you sure?");
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();

    }


}
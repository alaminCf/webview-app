package com.softaloy.proyojon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

        ImageView logo;
        LottieAnimationView anim;
        Animation my_anim;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        logo= findViewById(R.id.logo);
        anim= findViewById(R.id.anim);
        my_anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.my_anim);

        logo.startAnimation(my_anim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(getApplicationContext(), Dashboard.class);
                startActivity(intent);
                finish();

            }
        },2000);

    }
}
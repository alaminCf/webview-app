package com.softaloy.proyojon.birth;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.softaloy.proyojon.R;

public class Birth_Correction extends AppCompatActivity {

    WebView web_correction;
    ProgressBar progres_coreection;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_correction);

        web_correction = findViewById(R.id.web_correction);
        progres_coreection = findViewById(R.id.progres_coreection);


        web_correction.getSettings().setJavaScriptEnabled(true);
        web_correction.loadUrl("https://bdris.gov.bd/br/correction");

        web_correction.setWebViewClient(new WebViewClient(){

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progres_coreection.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progres_coreection.setVisibility(View.GONE);
            }
        });

    }
    @Override
    public void onBackPressed() {
        if (web_correction.canGoBack()) {
            web_correction.goBack();
        }else {
            super.onBackPressed();
        }

    }
}
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

public class Birth_Current_Status extends AppCompatActivity {

    WebView web_current;
    ProgressBar progres_current;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_current_status);

        web_current = findViewById(R.id.web_current);
        progres_current = findViewById(R.id.progres_current);


        web_current.getSettings().setJavaScriptEnabled(true);
        web_current.loadUrl("https://bdris.gov.bd/login");

        web_current.setWebViewClient(new WebViewClient(){

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progres_current.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progres_current.setVisibility(View.GONE);
            }
        });

    }
    @Override
    public void onBackPressed() {
        if (web_current.canGoBack()) {
            web_current.goBack();
        }else {
            super.onBackPressed();
        }

    }
}
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

public class Birth_Print extends AppCompatActivity {

    WebView web_print;
    ProgressBar progres_print;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_print);

        web_print = findViewById(R.id.web_print);
        progres_print = findViewById(R.id.progres_print);


        web_print.getSettings().setJavaScriptEnabled(true);
        web_print.loadUrl("https://bdris.gov.bd/application/print");

        web_print.setWebViewClient(new WebViewClient(){

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progres_print.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progres_print.setVisibility(View.GONE);
            }
        });

    }
    @Override
    public void onBackPressed() {
        if (web_print.canGoBack()) {
            web_print.goBack();
        }else {
            super.onBackPressed();
        }

    }
}
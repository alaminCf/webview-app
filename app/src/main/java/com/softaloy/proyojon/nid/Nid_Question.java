package com.softaloy.proyojon.nid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.softaloy.proyojon.R;

public class Nid_Question extends AppCompatActivity {

    WebView webview;
    ProgressBar progresbar;

    @SuppressLint({"SetJavaScriptEnabled", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nid_question);

        webview = findViewById(R.id.webview);
        progresbar = findViewById(R.id.progresbar);


        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://services.nidw.gov.bd/nid-pub/faq?tab=faq-lost");

        webview.setWebViewClient(new WebViewClient(){

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progresbar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progresbar.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack();
        }else {
            super.onBackPressed();
        }

    }
}
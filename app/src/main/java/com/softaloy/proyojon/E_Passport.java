package com.softaloy.proyojon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class E_Passport extends AppCompatActivity {

    WebView web_search;
    ProgressBar progres_search;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epassport);

        web_search = findViewById(R.id.web_search);
        progres_search = findViewById(R.id.progres_search);


        WebSettings webSettings = web_search.getSettings();
        web_search.getSettings().setJavaScriptEnabled(true);

        //improve webview perfornace
        web_search.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        web_search.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        web_search.getSettings().setAppCacheEnabled(true);
        web_search.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSettings.setUseWideViewPort(true);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        //webview batter performace


        web_search.loadUrl("https://www.epassport.gov.bd/landing");

        web_search.setWebViewClient(new WebViewClient(){

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progres_search.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progres_search.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (web_search.canGoBack()) {
            web_search.goBack();
        }else {
            super.onBackPressed();
        }

    }
}
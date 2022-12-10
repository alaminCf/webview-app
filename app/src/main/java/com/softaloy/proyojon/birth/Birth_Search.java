package com.softaloy.proyojon.birth;

import static com.softaloy.proyojon.R.id.progres_search;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.softaloy.proyojon.R;

public class Birth_Search extends AppCompatActivity {

    WebView web_search;
    ProgressBar progres_search;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_search);

        web_search = findViewById(R.id.web_search);
        progres_search = findViewById(R.id.progres_search);



        web_search.getSettings().setJavaScriptEnabled(true);
        web_search.loadUrl("https://everify.bdris.gov.bd/");

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
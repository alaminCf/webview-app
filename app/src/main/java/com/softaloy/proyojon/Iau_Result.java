package com.softaloy.proyojon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.airbnb.lottie.LottieAnimationView;

public class Iau_Result extends AppCompatActivity {

    WebView webview;
    ProgressBar progresbar;
    LottieAnimationView animate;
    AppCompatButton print;
    SwipeRefreshLayout reload;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iau_result);


        webview = findViewById(R.id.webview);
        progresbar = findViewById(R.id.progresbar);
        animate = findViewById(R.id.animate);
        print = findViewById(R.id.print);
        reload = findViewById(R.id.reload);

        print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code Here ==========
                createWebPrintJob(webview);
            }
        });


        WebSettings webSettings = webview.getSettings();
        webview.loadUrl("javascript:window.location.reload( true )");
        webview.getSettings().setJavaScriptEnabled(true);

        webview.loadUrl("http://result.iau.edu.bd/");


        //improve webview perfornace
        webview.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webview.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webview.getSettings().setAppCacheEnabled(true);
        webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSettings.setUseWideViewPort(true);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        //webview batter performace



        reload.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                webview.reload();
            }
        });

        webview.setWebViewClient(new WebViewClient(){

            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progresbar.setVisibility(View.VISIBLE);
                animate.setVisibility(View.GONE);

            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progresbar.setVisibility(View.GONE);
                print.setVisibility(View.VISIBLE);
                reload.setRefreshing(false);
            }
        });
    }

    private void createWebPrintJob(WebView webView) {
        PrintManager printManager = (PrintManager) this.getSystemService(Context.PRINT_SERVICE);
        PrintDocumentAdapter printAdapter = webView.createPrintDocumentAdapter();
        String jobName = getString(R.string.app_name) + " Print Test";
        printManager.print(jobName, printAdapter, new PrintAttributes.Builder().build());
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
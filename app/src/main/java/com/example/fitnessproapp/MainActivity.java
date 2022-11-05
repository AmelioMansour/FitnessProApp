package com.example.fitnessproapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.fitnessproapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    WebView webView;


    //private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // webview section made from vid
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://ameliomansour.github.io/Fitness-Pro-Website/Frontend");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);



    }

}
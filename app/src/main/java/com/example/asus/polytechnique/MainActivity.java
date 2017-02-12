package com.example.asus.polytechnique;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
     private WebView mywebView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebView =(WebView)findViewById(R.id.webview);
        WebSettings mywebSettings= mywebView.getSettings();
        mywebSettings.setJavaScriptEnabled(true);//activer la JS
        mywebView.loadUrl("https://www.polytecsousse.tn");
        mywebView.setWebViewClient(new WebViewClient());

    }

    @Override
    //quand on click sur le button de retour
    public void onBackPressed() {
        if(mywebView.canGoBack())
        {   //si l'app peut retourner a une page precedante
            mywebView.goBack();}
        else
        {   //l'app sort
            super.onBackPressed();}

    }
}

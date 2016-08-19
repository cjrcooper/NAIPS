package com.coops.naips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);


        myWebView=(WebView)findViewById(R.id.naips);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        myWebView.loadUrl("https://www.airservicesaustralia.com/naips/Account/LogOn");
        myWebView.setWebChromeClient(new WebChromeClient() );

    }


    public void submitLogin(View view){

        EditText userNameField = (EditText) findViewById(R.id.userName);
        EditText passwordField = (EditText) findViewById(R.id.password);

        Log.i("Info", userNameField.getText().toString());
        Log.i("Info", passwordField.getText().toString());

    }

}

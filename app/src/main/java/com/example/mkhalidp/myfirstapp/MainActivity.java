package com.example.mkhalidp.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String textHelloWorld = "Hello World, nama saya Muhammad Khalid Perwira";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void display(View view){
        TextView text = (TextView) findViewById(R.id.Click_Me);
        text.setText(textHelloWorld + "");
    }
}

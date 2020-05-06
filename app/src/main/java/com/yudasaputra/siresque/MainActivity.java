package com.yudasaputra.siresque;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_nasional,btn_jabar;
    //TextView pagejabar, pagenasional;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_nasional = (Button) findViewById(R.id.btn_nasional);
        btn_nasional.setOnClickListener(this);
        btn_jabar = (Button) findViewById(R.id.btn_jabar);
        btn_jabar.setOnClickListener(this);


    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_jabar:
                Intent moveIntent;
                moveIntent = new Intent(MainActivity.this, ActivityJabar.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_nasional:
                moveIntent = new Intent(MainActivity.this, ActivityNasional.class);
                startActivity(moveIntent);
                break;
        }
    }}
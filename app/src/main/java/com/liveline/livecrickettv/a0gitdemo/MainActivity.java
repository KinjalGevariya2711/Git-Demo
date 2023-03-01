package com.liveline.livecrickettv.a0gitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.liveline.livecrickettv.newads2023.Toasterrr;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toasterrr.simpleToast(this,"kinjeel");

    }
}
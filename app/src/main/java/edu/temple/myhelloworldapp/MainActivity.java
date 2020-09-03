package edu.temple.myhelloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a = 4;
        int b = 235;
        int total = a + b;

        Log.d("Theansweris:   ", String.valueOf(total));

    }
}
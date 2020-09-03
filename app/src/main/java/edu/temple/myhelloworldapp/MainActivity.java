package edu.temple.myhelloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.clickMeButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 2;
                int b = 45;

                float answer = (float) b / a;
                Toast.makeText(MainActivity.this, "The answer is " + answer, Toast.LENGTH_LONG).show();
            }
        });
    }

}
package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Toast t2 = Toast.makeText(this, "Android", Toast.LENGTH_SHORT);
        t2.show();

        Button startButton = findViewById(R.id.start_button);

        startButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
            }
        });


    Button exitButton = findViewById(R.id.exit_button);

        exitButton.setOnClickListener(new View.OnClickListener(){
        public void onClick(View view){
            finish();
        }
    }}
}

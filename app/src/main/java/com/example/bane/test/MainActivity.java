package com.example.bane.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView imgLogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imgLogo = findViewById(R.id.iv_logo);
        imgLogo.setOnClickListener(v-> Toast.makeText(this, "Test test", Toast.LENGTH_SHORT).show());
    }
}

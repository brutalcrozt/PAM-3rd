package com.example.pamsenin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    private TextView txtWelcome, txtSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent prev = getIntent();

        txtWelcome= findViewById(R.id.welcome);
        txtSecond= findViewById(R.id.second);

        txtSecond.setText(" it's : "+ prev.getStringExtra("username") + " and : "+ prev.getStringExtra("password"));
    }
}

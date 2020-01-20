package com.example.pamsenin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText txtUsername;
    private EditText txtPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUsername= findViewById(R.id.txtUsername);
        txtPwd= findViewById(R.id.password);
    }

    public void Login(View v) {
        String uname= txtUsername.getText().toString();
//        Toast.makeText(this, uname + " " + txtPwd.getText().toString(), Toast.LENGTH_LONG).show();
//        from, to
        Intent i= new Intent(this, Home.class);
        i.putExtra("username", uname);
        i.putExtra("password", txtPwd.getText().toString());
        startActivity(i);
    }
}

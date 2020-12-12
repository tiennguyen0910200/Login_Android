package com.example.login2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =  findViewById(R.id.ok);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);

            }
        });


    }

//    EditText email = (EditText) findViewById(R.id.email);
//    EditText password = (EditText) findViewById(R.id.pw);

    public void login(View view) {
//        if (email.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
            Intent intent = new Intent(getApplicationContext(),AppCompatActivity.class);
            startActivity(intent);
//        }
    }
}
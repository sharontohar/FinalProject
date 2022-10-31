package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText name = findViewById(R.id.r_name);
        final EditText mobile = findViewById(R.id.r_mobile);
        final EditText email = findViewById(R.id.r_email);
        final EditText pass = findViewById(R.id.r_pass);
        final AppCompatButton registerBtn = findViewById(R.id.r_registerBtn);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String nameText = name.getText().toString();
                final String mobileText = mobile.getText().toString();
                final String emailText = email.getText().toString();
                final String passText = pass.getText().toString();

                if(nameText.isEmpty() || mobileText.isEmpty() || emailText.isEmpty() || passText.isEmpty()){
                    Toast.makeText(Register.this, "All fields Required", Toast.LENGTH_LONG).show();
                }
                else{

                }
            }
        });

    }
}
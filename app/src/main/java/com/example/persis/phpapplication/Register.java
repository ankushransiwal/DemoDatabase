package com.example.persis.phpapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText etUsername,etPassword, etContact,etCountry;

    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        etContact = findViewById(R.id.etContact);
        etCountry = findViewById(R.id.etCountry);
        btnRegister= findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                String contact = etContact.getText().toString();
                String country = etCountry.getText().toString();
                String method = "register";

                MyAsyncTask myAsyncTask = new MyAsyncTask(Register.this);
                myAsyncTask.execute(method,name,password,contact,country);


            }
        });





    }
}

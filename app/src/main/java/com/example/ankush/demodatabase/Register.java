package com.example.ankush.demodatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    EditText tvName, tvPassword, tvContact, tvCountry;
    String name, password, contact, country;
    Button btnInsert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        tvName = findViewById(R.id.tvName);
        tvPassword = findViewById(R.id.tvPassword);
        tvContact = findViewById(R.id.tvContact);
        tvCountry = findViewById(R.id.tvCountry);
        btnInsert = findViewById(R.id.btnInsert);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = tvName.getText().toString();
                password = tvPassword.getText().toString();
                contact = tvContact.getText().toString();
                country = tvCountry.getText().toString();
            }
        });


    }
}

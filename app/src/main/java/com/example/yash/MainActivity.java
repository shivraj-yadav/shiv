package com.example.yash;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button button;
    String user,pass;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 user = String.valueOf(e1.getText());
                 pass= String.valueOf(e2.getText());

                if(user.equals("yash") && pass.equals("123"))
                {
                    get();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Unsuccess", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
        public void get()
        {
            Intent i =new Intent(MainActivity.this, login.class);
            startActivity(i);
        }
}
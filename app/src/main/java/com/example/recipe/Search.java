package com.example.recipe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Search extends AppCompatActivity {
    AppCompatButton a1,a2;
    EditText b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search);
        a1 = (AppCompatButton)findViewById(R.id.search);
        a2 = (AppCompatButton)findViewById(R.id.back);
        b1 = (EditText)findViewById(R.id.title);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = b1.getText().toString();
                    Toast.makeText(getApplicationContext(),s1, Toast.LENGTH_SHORT).show();
                }
                catch(Exception e) {
                    Toast.makeText(getApplicationContext(),"invalid", Toast.LENGTH_SHORT).show();
                }
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}
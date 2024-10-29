package com.example.intencjezadanie5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewName;
    private TextView textViewAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewName = findViewById(R.id.textViewName);
        textViewAge = findViewById(R.id.textViewAge);

        String name = getIntent().getStringExtra("EXTRA_NAME");
        int age = getIntent().getIntExtra("EXTRA_AGE", 0);

        textViewName.setText("Imię: " + name);
        textViewAge.setText("Wiek: " + age);
    }
}

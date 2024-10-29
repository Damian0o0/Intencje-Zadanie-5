package com.example.intencjezadanie5;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextAge;
    private Button buttonSubmitForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);
        buttonSubmitForm = findViewById(R.id.buttonSubmitForm);

        buttonSubmitForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String ageText = editTextAge.getText().toString();

                if (!name.isEmpty() && !ageText.isEmpty()) {
                    int age = Integer.parseInt(ageText);

                    Intent intent = new Intent(FormActivity.this, SecondActivity.class);
                    intent.putExtra("EXTRA_NAME", name);
                    intent.putExtra("EXTRA_AGE", age);

                    startActivity(intent);
                } else {
                    Toast.makeText(FormActivity.this, "Wprowadź wszystkie dane", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
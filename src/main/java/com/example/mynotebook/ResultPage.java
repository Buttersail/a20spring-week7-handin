package com.example.mynotebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultPage extends AppCompatActivity {

    private TextView resultText;
    private String savedString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);

        resultText = findViewById(R.id.result);
        Intent intent = getIntent();
        savedString = intent.getExtras().getString("resultString");
        resultText.setText(savedString);
    }
}

package com.example.mynotebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editInput;
    private Button btn_save;
    private Button btn_send;
    private String savedString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_save = findViewById(R.id.btn_save);
        btn_save.setOnClickListener(this);
        btn_send = findViewById(R.id.btn_send);
        btn_send.setOnClickListener(this);
        editInput = findViewById(R.id.editInput);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_save:
                savedString = editInput.getText().toString();
                break;
            case R.id.btn_send:
                Intent intent_send = new Intent(this, ResultPage.class);
                intent_send.putExtra("resultString", savedString);
                startActivity(intent_send);
                break;
        }

    }
}

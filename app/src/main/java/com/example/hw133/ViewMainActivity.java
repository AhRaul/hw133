package com.example.hw133;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ViewMainActivity extends AppCompatActivity implements ViewInterface{

    private Button buttonProcess;
    private EditText editableText;
    private TextView resultText;
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonProcess = findViewById(R.id.button);
        editableText = findViewById(R.id.editText);
        resultText = findViewById(R.id.textView2);

        presenter = new Presenter(this);

        buttonProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick(v);
            }
        });
    }

    public void buttonClick(View view) {
        presenter.onButtonClick(String.valueOf(editableText.getText()));
    }

    @Override
    public void setTextView(String newWord) {
        resultText.setText(newWord);
    }
}

package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText Name ;
    TextView VName;

    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        Name = (EditText) findViewById(R.id.Name);
        VName = (TextView) findViewById(R.id.VName);
    }

    public void Send (View view){
        name = (Name.getText().toString());
        VName.setText("Hello "+ name);
    }
}
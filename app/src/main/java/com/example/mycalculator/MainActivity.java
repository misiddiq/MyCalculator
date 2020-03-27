package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1;
    TextView t1;

    Button bs2;
    Button bm2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        b1 = (Button)findViewById(R.id.b1);
        t1 = (TextView)findViewById(R.id.tv1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(e1.getText().toString());
                double num2 = Double.parseDouble(e2.getText().toString());
                double result = num1 + num2;
//                t1.setText(Double.toString(result));
                t1.setText(String.format("%.2f",result));
            }
        });

        bs2 = (Button)findViewById(R.id.bs2);
        bm2 = (Button)findViewById(R.id.bm2);

        bs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(e1.getText().toString());
                double num2 = Double.parseDouble(e2.getText().toString());
                double result = num1 - num2;
//                t1.setText(Double.toString(result));
                t1.setText(String.format("%.2f", result));
            }
        });

        bm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(e1.getText().toString());
                double num2 = Double.parseDouble(e2.getText().toString());
                double result = num1 * num2;
//                t1.setText(Double.toString(result));
                t1.setText(String.format("%.2f", result));
            }
        });
    }
}
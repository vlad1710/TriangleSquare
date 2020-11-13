package com.example.trianglesquare;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CountSquareActivity extends AppCompatActivity {
    private ImageView imageViewTriangle;
    private EditText sideA, sideB, sideC, alpha;
    private TextView resultCountSquare;
    private double result;
    private int variant;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_square);
        imageViewTriangle = findViewById(R.id.imageViewTriangle);
        sideA = findViewById(R.id.editTextSideA);
        sideB = findViewById(R.id.editTextSideB);
        sideC = findViewById(R.id.editTextSideC);
        alpha = findViewById(R.id.editTextAlpha);
        resultCountSquare = findViewById(R.id.textViewResultCountSquare);
        Intent intent = getIntent();
        variant = intent.getIntExtra("triangle", 1);
        setImage(variant);

    }

    public void calculateSquare(View view) {
        double a = !(sideA.getText().length() == 0) ? Double.parseDouble(sideA.getText().toString()) : 0;
        double b = !(sideB.getText().length() == 0) ? Double.parseDouble(sideB.getText().toString()) : 0;
        double c = !(sideC.getText().length() == 0) ? Double.parseDouble(sideC.getText().toString()) : 0;
        double corner = !(alpha.getText().length() == 0) ? Double.parseDouble(alpha.getText().toString()) : 0;
        getResult(a, b, c, corner, variant);
    }

    private void getResult(double a, double b, double c, double al, int triangleFunction){
        switch (triangleFunction) {
            case 1:
                result = 0.5*a*b;
                resultCountSquare.setText(String.valueOf(result));
                break;
            case 2:
                result = (Math.sqrt(3)*a*a)/4;
                resultCountSquare.setText(String.valueOf(result));
                break;
            case 3:
                result = 0.5*a*a*Math.sin(Math.toRadians(al));
                resultCountSquare.setText(String.valueOf(result));
                break;
            case 4:
                double p = (a+b+c)/2;
                result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                resultCountSquare.setText(String.valueOf(result));
                break;
        }
    }

    @SuppressLint("ResourceType")
    private void setImage(int a) {
        switch (a) {
            case 1:
                imageViewTriangle.setImageResource(R.drawable.right_triangle);
                break;
            case 2:
                imageViewTriangle.setImageResource(R.drawable.equilateral_triangle);
                break;
            case 3:
                imageViewTriangle.setImageResource(R.drawable.isosceles_triangle);
                break;
            case 4:
                imageViewTriangle.setImageResource(R.drawable.versatile_triangle);
                break;
        }
    }
}
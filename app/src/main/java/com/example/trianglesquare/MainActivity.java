package com.example.trianglesquare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rightTriangleSquare(View view) {
        Intent intent = new Intent(this, CountSquareActivity.class);
        intent.putExtra("triangle", 1);
        startActivity(intent);
    }

    public void equilateralTriangleSquare(View view) {
        Intent intent = new Intent(this, CountSquareActivity.class);
        intent.putExtra("triangle", 2);
        startActivity(intent);
    }

    public void isoscelesTriangleSquare(View view) {
        Intent intent = new Intent(this, CountSquareActivity.class);
        intent.putExtra("triangle", 3);
        startActivity(intent);
    }

    public void versatileTriangleSquare(View view) {
        Intent intent = new Intent(this, CountSquareActivity.class);
        intent.putExtra("triangle", 4);
        startActivity(intent);
    }
}
package com.challenged.randownnumber;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void randomNumber(View view) {

        TextView textResultNumber = findViewById(R.id.tvSubTitle);

        int number = new Random().nextInt(11);

        textResultNumber.setText("Número: " + number);
    }
}
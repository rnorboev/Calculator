package com.ravshanbek.calculator;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ravshanbek.calculator.databinding.ActivityMainBinding;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';

    private char CURRENT_ACTION;

    private double valueOne = Double.NaN;
    private double valueTwo;

    private DecimalFormat decimalFormat;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}

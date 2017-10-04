package com.example.chance.cs_399_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] calc = {""};

        final Button buttonZero = (Button) findViewById(R.id.buttonZero);
        final Button buttonOne = (Button) findViewById(R.id.buttonOne);
        final Button buttonTwo = (Button) findViewById(R.id.buttonTwo);
        final Button buttonThree = (Button) findViewById(R.id.buttonThree);
        final Button buttonFour = (Button) findViewById(R.id.buttonFour);
        final Button buttonFive = (Button) findViewById(R.id.buttonFive);
        final Button buttonSix = (Button) findViewById(R.id.buttonSix);
        final Button buttonSeven = (Button) findViewById(R.id.buttonSeven);
        final Button buttonEight = (Button) findViewById(R.id.buttonEight);
        final Button buttonNine = (Button) findViewById(R.id.buttonNine);
        final Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        final Button buttonDivide = (Button) findViewById(R.id.buttonDivide);
        final Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        final Button buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
        final Button buttonEquals = (Button) findViewById(R.id.buttonEquals);
        final Button buttonDot = (Button) findViewById(R.id.buttonDot);
        final Button buttonCLR = (Button) findViewById(R.id.buttonCLR);
        final TextView textView = (TextView) findViewById(R.id.textCalc);
        final TextView textAns = (TextView) findViewById(R.id.textAns);

        buttonZero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc[0] += "0";
                textView.setText(calc[0]);
            }
        });

        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc[0] += "1";
                textView.setText(calc[0]);
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc[0] += "2";
                textView.setText(calc[0]);
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc[0] += "3";
                textView.setText(calc[0]);
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc[0] += "4";
                textView.setText(calc[0]);
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc[0] += "5";
                textView.setText(calc[0]);

            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc[0] += "6";
                textView.setText(calc[0]);
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc[0] += "7";
                textView.setText(calc[0]);
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc[0] += "8";
                textView.setText(calc[0]);
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc[0] += "9";
                textView.setText(calc[0]);
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc[0] += "+";
                textView.setText(calc[0]);
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc[0] += "/";
                textView.setText(calc[0]);
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc[0] += "-";
                textView.setText(calc[0]);
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc[0] += "*";
                textView.setText(calc[0]);
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc[0] += ".";
                textView.setText(calc[0]);
            }
        });

        buttonCLR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc[0] = "";
                textView.setText(calc[0]);
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String ans = exec_calc(calc[0]);
                textAns.setText(ans);
                calc[0] = "";
                textView.setText(calc[0]);
            }
        });

    }

    private String exec_calc(String input) {


        return input;
    }
}

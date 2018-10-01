package com.example.n_hanova.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView, number1, number2, operation;

    Button clear, sqr, sqrt, divide, add, subtract, multiply, equal;

    Button one, two, three, four, five, six, seven, eight, nine, zero ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //code for hide title bar.
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.resultField);

        number1 = (TextView) findViewById(R.id.numberField1);
        number2 = (TextView) findViewById(R.id.numberField2);
        operation = (TextView) findViewById(R.id.operationField);

        clear = (Button)findViewById(R.id.buttonClearText);
        sqrt = (Button)findViewById(R.id.buttonSqrt);
        sqr = (Button)findViewById(R.id.buttonSqr);
        divide = (Button)findViewById(R.id.buttonDivide);
        add = (Button)findViewById(R.id.buttonAdd);
        subtract = (Button)findViewById(R.id.buttonSubtraction);
        multiply = (Button)findViewById(R.id.buttonMultiply);
        equal = (Button)findViewById(R.id.buttonEqual);

        one = (Button)findViewById(R.id.button1);
        two = (Button)findViewById(R.id.button2);
        three = (Button)findViewById(R.id.button3);
        four = (Button)findViewById(R.id.button4);
        five = (Button)findViewById(R.id.button5);
        six = (Button)findViewById(R.id.button6);
        seven = (Button)findViewById(R.id.button7);
        eight = (Button)findViewById(R.id.button8);
        nine = (Button)findViewById(R.id.button9);
        zero = (Button)findViewById(R.id.buttonZero);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(null);
                number1.setText(null);
                number2.setText(null);
                operation.setText(null);
            }
        });


        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                operation.setText("√");

            }
        });

        sqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                operation.setText("x^2");

            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                operation.setText(textView.getText() + "/");

            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                operation.setText(textView.getText() + "+");
            }
        });


        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                operation.setText(textView.getText() + "-");

            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                operation.setText(textView.getText() + "*");

            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (operation.getText().toString()) {
                    case "+":
                        Double n = Double.valueOf(number1.getText().toString()) + Double.valueOf(number2.getText().toString());
                        textView.setText(n.toString());
                        break;

                    case "-":
                        Double n1 = Double.valueOf(number1.getText().toString()) - Double.valueOf(number2.getText().toString());
                        textView.setText(n1.toString());
                        break;

                    case "*":
                        Double n2 = Double.valueOf(number1.getText().toString()) * Double.valueOf(number2.getText().toString());
                        textView.setText(n2.toString());
                        break;

                    case "/":
                        Double n3 = Double.valueOf(number1.getText().toString()) / Double.valueOf(number2.getText().toString());
                        textView.setText(n3.toString());
                        break;
                    case "√":
                        Double n4 = Math.sqrt(Double.valueOf(number1.getText().toString()));
                        textView.setText(n4.toString());
                        break;

                    case "x^2":
                        Double n5 = Math.pow(Double.valueOf(number1.getText().toString()), 2);
                        textView.setText(n5.toString());
                        break;

                    default:
                        textView.setText("error");
                        break;

                }
            }
        });


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String op = operation.getText().toString();

                if (op.length() == 0)
                    number1.setText(number1.getText() + "1");

                else
                    number2.setText(number2.getText() + "1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String op = operation.getText().toString();

                if (op.length() == 0)
                    number1.setText(number1.getText() + "2");

                else
                    number2.setText(number2.getText() + "2");

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String op = operation.getText().toString();

                if (op.length() == 0)
                    number1.setText(number1.getText() + "3");

                else
                    number2.setText(number2.getText() + "3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String op = operation.getText().toString();

                if (op.length() == 0)
                    number1.setText(number1.getText() + "4");

                else
                    number2.setText(number2.getText() + "4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String op = operation.getText().toString();

                if (op.length() == 0)
                    number1.setText(number1.getText() + "5");

                else
                    number2.setText(number2.getText() + "5");

            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String op = operation.getText().toString();

                if (op.length() == 0)
                    number1.setText(number1.getText() + "6");

                else
                    number2.setText(number2.getText() + "6");

            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String op = operation.getText().toString();

                if (op.length() == 0)
                    number1.setText(number1.getText() + "7");

                else
                    number2.setText(number2.getText() + "7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String op = operation.getText().toString();

                if (op.length() == 0)
                    number1.setText(number1.getText() + "8");

                else
                    number2.setText(number2.getText() + "8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String op = operation.getText().toString();

                if (op.length() == 0)
                    number1.setText(number1.getText() + "9");

                else
                    number2.setText(number2.getText() + "9");

            }
        });


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String op = operation.getText().toString();

                if (op.length() == 0)
                    number1.setText(number1.getText() + "0");

                else
                    number2.setText(number2.getText() + "0");

            }
        });
    }

}

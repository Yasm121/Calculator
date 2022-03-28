package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private LinearLayout linearLayout1;
    private LinearLayout linearLayout2;
    private LinearLayout linearLayout3;
    private LinearLayout linearLayout4;

    private EditText editText;
    private TextView textView;
    private Button btn1,btn2,btn3,btnDivision,btn5,btn6,btn7,btnMultiplication;
    private Button btn9,btn10,btn11,btnAddition,btnReset,btnClear,btnEqualTo,btnSubtraction;
    float num1,sum,num2;
    boolean add,sub,multi,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout1=findViewById(R.id.linearLayout1);
        linearLayout2=findViewById(R.id.linearLayout2);
        linearLayout3=findViewById(R.id.linearLayout3);
        linearLayout4=findViewById(R.id.linearLayout4);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn9=findViewById(R.id.btn9);
        btn10=findViewById(R.id.btn10);
        btn11=findViewById(R.id.btn11);

        btnDivision=findViewById(R.id.btnDivision);
        btnMultiplication=findViewById(R.id.btnMultiplication);
        btnAddition=findViewById(R.id.btnAddition);
        btnSubtraction=findViewById(R.id.btnSubtraction);
        btnEqualTo=findViewById(R.id.btnEqualTo);
        btnClear=findViewById(R.id.btnClear);
        btnReset=findViewById(R.id.btnReset);


        btn1.setOnClickListener(new btn1());
        btn2.setOnClickListener(new btn2());
        btn3.setOnClickListener(new btn3());
        btn5.setOnClickListener(new btn5());
        btn6.setOnClickListener(new btn6());
        btn7.setOnClickListener(new btn7());
        btn9.setOnClickListener(new btn9());
        btn10.setOnClickListener(new btn10());
        btn11.setOnClickListener(new btn11());

        btnAddition.setOnClickListener(new btnAddition());
        btnSubtraction.setOnClickListener(new btnSubtraction());
        btnMultiplication.setOnClickListener(new btnMultiplication());
        btnDivision.setOnClickListener(new btnDivision());
        btnEqualTo.setOnClickListener(new btnEqualTo());
        btnClear.setOnClickListener(new btnClear());
        btnReset.setOnClickListener(new btnReset());


    }

    private class btn1 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Button btn1 = new Button(MainActivity.this);
            btn1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));

            textView.setText("1");
        }
    }

    private class btn2 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Button btn2 = new Button(MainActivity.this);
            btn2.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));

            textView.setText("2");

        }
    }


    private class btn3 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Button btn3 = new Button(MainActivity.this);
            btn3.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));

            textView.setText("3");

        }
    }

    private class btn5 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Button btn5 = new Button(MainActivity.this);
            btn5.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));

            textView.setText("5");

        }
    }


    private class btn6 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Button btn6= new Button(MainActivity.this);
            btn6.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));

            textView.setText("6");

        }
    }


    private class btn7 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Button btn7= new Button(MainActivity.this);
            btn7.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));

            textView.setText("7");

        }
    }

    private class btn9 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Button btn9= new Button(MainActivity.this);
            btn9.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));

            textView.setText("9");

        }
    }

    private class btn10 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Button btn10= new Button(MainActivity.this);
            btn10.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));

            textView.setText("10");

        }
    }

    private class btn11 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Button btn11= new Button(MainActivity.this);
            btn11.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));

            textView.setText("11");

        }
    }

    private class btnAddition implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            num1=Float.parseFloat(textView.getText()+ "");
            textView.setText("");
            add=true;
        }
    }

    private class btnSubtraction implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            num1=Float.parseFloat(textView.getText()+ "");
            textView.setText("");
            sub=true;
        }
    }

    private class btnMultiplication implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            num1=Float.parseFloat(textView.getText()+ "");
            textView.setText("");
            multi=true;
        }
    }

    private class btnDivision implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            num1=Float.parseFloat(textView.getText()+ "");
            textView.setText("");
            div=true;
        }
    }

    private class btnClear implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            textView.setText("");

        }
    }

    private class btnReset implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            textView.setText("00.00");

        }
    }

    private class btnEqualTo implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (add == true) {
                num2 = Float.parseFloat(textView.getText() + "");
                sum = num1 + num2;
                textView.setText(sum + "");
                add = false;
            }
            if (sub = true) {
                num2 = Float.parseFloat(textView.getText() + "");
                sum = num1 - num2;
                textView.setText(sum + "");
                sub = false;
            }
            if (multi = true) {
                num2 = Float.parseFloat(textView.getText() + "");
                sum = num1 * num2;
                textView.setText(sum + "");
                multi = false;
            }
            if (div = true) {
                num2 = Float.parseFloat(textView.getText() + "");
                sum = num1 / num2;
                textView.setText(sum + "");
                div = false;
            }

        }

    }
}
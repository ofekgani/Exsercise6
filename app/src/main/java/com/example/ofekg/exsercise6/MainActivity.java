package com.example.ofekg.exsercise6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public Button btn0;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    int num0, num1;
    int result = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 =  findViewById(R.id.btn0);
        btn1 =  findViewById(R.id.btn1);
        btn2 =  findViewById(R.id.btn2);
        btn3 =  findViewById(R.id.btn3);
        btn4 =  findViewById(R.id.btn4);
        btn5 =  findViewById(R.id.btn5);
        btn6 =  findViewById(R.id.btn6);
    }

    public void number1(View view) {

    }

    public void big(View view) {
        if(num0 > num1) {
            result = 1;
        }else{
            result = 0;
        }
        switch (result){
            case 0: btn4.setText("false");
                break;
            case 1: btn4.setText("true");
                break;
            case 2: btn4.setText("");
                break;
        }
    }

    public void eq(View view) {
        if(num0 == num1) {
            result = 1;
        }else{
            result = 0;
        }
        switch (result){
            case 0: btn4.setText("false");
                break;
            case 1: btn4.setText("true");
                break;
            case 2: btn4.setText("");
                break;
        }
    }

    public void small(View view) {
        if(num0  < num1) {
            result = 1;
        }else{
            result = 0;
        }
        switch (result){
            case 0: btn4.setText("false");
                break;
            case 1: btn4.setText("true");
                break;
            case 2: btn4.setText("");
                break;
        }
    }

    public void result(View view) {
    }

    public void number2(View view) {
    }

    public void rndNum(View view) {
        Random rnd= new Random();
        num0 = rnd.nextInt(100);
        num1 = rnd.nextInt(100);
        result = 2;
        btn0.setText(""+num0);
        btn5.setText(""+num1);
        switch (result){
            case 0: btn4.setText("false");
                break;
            case 1: btn4.setText("true");
                break;
            case 2: btn4.setText("");
                break;
        }
    }
}

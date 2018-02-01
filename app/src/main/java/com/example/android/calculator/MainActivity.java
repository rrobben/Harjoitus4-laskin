package com.example.android.calculator;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void count(View view) {
        EditText edit_text1;
        EditText edit_text2;
        int number1 = 0;
        int number2 = 0;
        int result = 0;
        int id = 0;

        switch (view.getId()) {
            case R.id.count_plus:
                edit_text1 = (EditText) findViewById(R.id.plus1);
                edit_text2 = (EditText) findViewById(R.id.plus2);

                number1 = getValue(edit_text1);
                number2 = getValue(edit_text2);
                result = number1 + number2;
                id = R.id.result_plus;
            break;
            case R.id.count_minus:
                edit_text1 = (EditText) findViewById(R.id.minus1);
                edit_text2 = (EditText) findViewById(R.id.minus2);

                number1 = getValue(edit_text1);
                number2 = getValue(edit_text2);
                result = number1 - number2;
                id = R.id.result_minus;
            break;
            case R.id.count_times:
                edit_text1 = (EditText) findViewById(R.id.times1);
                edit_text2 = (EditText) findViewById(R.id.times2);

                number1 = getValue(edit_text1);
                number2 = getValue(edit_text2);
                result = number1 * number2;
                id = R.id.result_times;
            break;
            case R.id.count_div:
                edit_text1 = (EditText) findViewById(R.id.div1);
                edit_text2 = (EditText) findViewById(R.id.div2);

                number1 = getValue(edit_text1);
                number2 = getValue(edit_text2);
                result = number1 / number2;
                id = R.id.result_div;
            break;
        }

        TextView view_result = (TextView) findViewById(id);
        view_result.setText(Integer.toString(result));

    }

    public void emptyAll(View view) {
        EditText text = (EditText) findViewById(R.id.plus1);
        text.setText(null);
        text = (EditText) findViewById(R.id.plus2);
        text.setText(null);

        text = (EditText) findViewById(R.id.minus1);
        text.setText(null);
        text = (EditText) findViewById(R.id.minus2);
        text.setText(null);

        text = (EditText) findViewById(R.id.times1);
        text.setText(null);
        text = (EditText) findViewById(R.id.times2);
        text.setText(null);

        text = (EditText) findViewById(R.id.div1);
        text.setText(null);
        text = (EditText) findViewById(R.id.div2);
        text.setText(null);

        TextView tv = (TextView) findViewById(R.id.result_plus);
        tv.setText("0");
        tv = (TextView) findViewById(R.id.result_minus);
        tv.setText("0");
        tv = (TextView) findViewById(R.id.result_times);
        tv.setText("0");
        tv = (TextView) findViewById(R.id.result_div);
        tv.setText("0");
    }

    private int getValue(EditText edit_text) {
        String text = edit_text.getText().toString();
        int number = (text.length() == 0 ? 0 : Integer.parseInt(text));
        return number;
    }
}

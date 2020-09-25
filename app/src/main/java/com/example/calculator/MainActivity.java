package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.AccessController;

public class MainActivity extends AppCompatActivity {

    private EditText num1,num2;
    private Button add, sub,mul,div;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1= (EditText)findViewById(R.id.editText1);
        num2= (EditText)findViewById(R.id.editText2);
        add= (Button) findViewById(R.id.btnAdd);
        sub= (Button) findViewById(R.id.btnSub);
        mul= (Button) findViewById(R.id.btnMul);
        div= (Button) findViewById(R.id.btnDiv);
        result=(TextView) findViewById(R.id.textView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num1.getText().length() != 0 && num2.getText().length() !=0)
                {
                    float n1 = Float.parseFloat(num1.getText().toString());
                    float n2 = Float.parseFloat(num2.getText().toString());
                    float sum = n1 + n2;
                    result.setText(String.valueOf(sum));
                }
                else
                {
                    Toast.makeText(v.getContext(),"Please enter both values",Toast.LENGTH_SHORT).show();
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().length() != 0 && num2.getText().length() !=0)
                {
                    float n1 = Float.parseFloat(num1.getText().toString());
                    float n2 = Float.parseFloat(num2.getText().toString());
                    float sum = n1 - n2;
                    result.setText(String.valueOf(sum));
                }
                else
                {
                    Toast.makeText(v.getContext(),"Please enter both values",Toast.LENGTH_SHORT).show();
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().length() != 0 && num2.getText().length() !=0)
                {
                    float n1 = Float.parseFloat(num1.getText().toString());
                    float n2 = Float.parseFloat(num2.getText().toString());
                    float sum = n1 * n2;
                    result.setText(String.valueOf(sum));
                }
                else
                {
                    Toast.makeText(v.getContext(),"Please enter both values",Toast.LENGTH_SHORT).show();
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().length() != 0 && num2.getText().length() !=0)
                {
                    float n1 = Float.parseFloat(num1.getText().toString());
                    float n2 = Float.parseFloat(num2.getText().toString());
                    if (n2 == 0) {
                        result.setText("Cannot divide by 0");
                    } else {
                        float sum = n1 / n2;
                        result.setText(String.valueOf(sum));
                    }
                }
                else
                {
                    Toast.makeText(v.getContext(),"Please enter both values",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
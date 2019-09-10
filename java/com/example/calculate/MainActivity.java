package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.lang.*;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 Button button0,button2,button3,button4,button5,button6,button7,button8,button9,buttonadd,buttonsub,buttondiv,buttonmult,buttondot
         ,buttonsqrt,buttonmod,buttonc,buttondel,button1,buttoneql,buttonsqr,buttonpow,buttonlog,buttonsin,buttoncos,buttontan,buttonby,buttonfact;
TextView textView2,error;
String first,second;
int operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
button2=(Button)findViewById(R.id.button2);
button1=(Button)findViewById(R.id.button1);
button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        buttonadd=(Button)findViewById(R.id.buttonadd);
        buttondiv=(Button)findViewById(R.id.buttondiv);
        buttonsub=(Button)findViewById(R.id.buttonsub);
        buttonmult=(Button)findViewById(R.id.buttonmult);
        buttonmod=(Button)findViewById(R.id.buttonmod);
        buttondot=(Button)findViewById(R.id.buttondot);
        buttoneql=(Button)findViewById(R.id.buttoneql);
        buttonsqrt=(Button)findViewById(R.id.buttonsqrt);
        button0=(Button)findViewById(R.id.button0);
        buttonc=(Button)findViewById(R.id.buttonc);
        buttondel=(Button)findViewById(R.id.buttondel);
        buttonsqr=(Button)findViewById(R.id.buttonsqr);
        buttonsin=(Button)findViewById(R.id.buttonsin);
        buttoncos=(Button)findViewById(R.id.buttoncos);
        buttontan=(Button)findViewById(R.id.buttontan);
        buttonlog=(Button)findViewById(R.id.buttonlog);
        buttonpow=(Button)findViewById(R.id.buttonpow);
        buttonby=(Button)findViewById(R.id.buttonby);
        buttonfact=(Button)findViewById(R.id.buttonfact);
        error=(TextView) findViewById(R.id.error);
        textView2=(TextView)findViewById(R.id.textView2);

    buttonsqr.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            first=textView2.getText().toString();
            textView2.setText(null);
            if (!(first.isEmpty())) {
                textView2.setText(Math.pow(Double.parseDouble(first), 2) + "");
            }
            else
            {
                error.setError("error");
            }
        }
    });
        buttonpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=textView2.getText().toString();
                textView2.setText(null);
                if (!(first.isEmpty())) {
                    operator = 6;
                }
                else
                {
                    error.setError("error");
                }
            }
        });
        buttonsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=textView2.getText().toString();
                textView2.setText(null);
                if (!(first.isEmpty())) {
                    Double x, y,z;
                    x = Double.parseDouble(first);
                    if (x%180==0)
                    {
                        textView2.setText("0");
                    }
                    else {
                        y = Math.toRadians(x);
                        textView2.setText(Math.sin(y) + "");
                    }
                }
                else
                {
                    error.setError("error");
                }
            }
        });
        buttoncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=textView2.getText().toString();
                textView2.setText(null);
                if (!(first.isEmpty())) {
                    Double x, y,z;
                    x = Double.parseDouble(first);
                    if (x%90==0)
                    {
                        z=x/90;
                        if (z%2!=0)
                        {
                            textView2.setText("0");
                        }
                        else
                        {
                            y = Math.toRadians(x);
                            textView2.setText(Math.cos(y) + "");
                        }
                    }
                    else {
                        y = Math.toRadians(x);
                        textView2.setText(Math.cos(y) + "");
                    }
                }
                else
                {
                    error.setError("error");
                }
            }
        });
        buttontan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=textView2.getText().toString();
                if (!(first.isEmpty())) {
                    Double x, y,z;
                    x = Double.parseDouble(first);
                    if (x%180==0 || x==90)
                    {
                        if (x==90)
                        {
                            textView2.setText("Infinity");
                        }
                        else {
                            textView2.setText("0");
                        }
                    }
                    else {
                        y = Math.toRadians(x);
                        textView2.setText(null);
                        textView2.setText(Math.tan(y) + "");
                    }
                }
                else
                {
                    error.setError("error");
                }
            }
        });
        buttonby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=textView2.getText().toString();
                textView2.setText(null);
                if (!(first.isEmpty())) {
                    textView2.setText((1 / Double.parseDouble(first)) + "");
                }
                else
                {
                    error.setError("error");
                }
            }
        });
        buttonfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=textView2.getText().toString();
                textView2.setText(null);
                if (!(first.isEmpty())) {
                    Double fact = 1.0, num;
                    num = Double.parseDouble(first);
                    if (num<999999) {
                        for (double i = num; i > 0; i--)
                            fact = fact * i;
                        textView2.setText(fact + "");
                    }
                    else
                    {
                        textView2.setText("Infinity");
                    }
                }
                else
                {
                    error.setError("error");
                }
            }
        });
        buttonlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=textView2.getText().toString();
                textView2.setText(null);
                if (!(first.isEmpty())) {
                    textView2.setText(Math.log(Double.parseDouble(first)) + "");
                }
                else
                {
                    error.setError("error");
                }
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                error.setError(null);
                textView2.setText(textView2.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                error.setError(null);
                textView2.setText(textView2.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                error.setError(null);
                textView2.setText(textView2.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                error.setError(null);error.setError(null);
                textView2.setText(textView2.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                error.setError(null);
                textView2.setText(textView2.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                error.setError(null);
                textView2.setText(textView2.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                error.setError(null);
                textView2.setText(textView2.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                error.setError(null);
                textView2.setText(textView2.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                error.setError(null);
                textView2.setText(textView2.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                error.setError(null);
                textView2.setText(textView2.getText()+"9");
            }
        });
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                error.setError(null);
                textView2.setText(textView2.getText()+".");
            }
        });
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                error.setError(null);
                textView2.setText(null);
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    first = textView2.getText().toString();
                    textView2.setText(null);
                    operator = 1;

            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=textView2.getText().toString();
                textView2.setText(null);
                operator=1;
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = textView2.getText().toString();
                if (first.isEmpty()) {
                    textView2.setText("-");
                }
                else
                {
                    textView2.setText(null);
                    operator = 2;
                }
            }
        });buttonmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=textView2.getText().toString();
                textView2.setText(null);
                operator=3;
            }
        });buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=textView2.getText().toString();
                textView2.setText(null);
                operator=4;
            }
        });
        buttonmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=textView2.getText().toString();
                textView2.setText(null);
                operator=5;
            }
        });
       buttonsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first=textView2.getText().toString();
                textView2.setText(null);
                if (!(first.isEmpty())) {
                    error.setError(null);
                    error.setError(null);
                    textView2.setText(Math.sqrt(Double.parseDouble(first)) + "");
                }
                else
                {
                    error.setError("error");
                }
                }
        });
       buttondel.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               error.setError(null);
               String s=textView2.getText().toString();
               textView2.setText("");
               for(int i=0;i<s.length()-1;i++)
                   textView2.setText(textView2.getText().toString()+s.charAt(i));

           }
       });
        buttoneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second=textView2.getText().toString();
                Double a,b;
                if (!(first.isEmpty()) && !(second.isEmpty())) {
                    a = Double.parseDouble(first);
                    b = Double.parseDouble(second);
                    textView2.setText(null);
                    switch (operator) {
                        case 1:
                            textView2.setText((a + b) + "");
                            break;
                        case 2:
                            textView2.setText((a - b) + "");
                            break;
                        case 3:
                            textView2.setText((a * b) + "");
                            break;
                        case 4:
                            textView2.setText((a / b) + "");
                            break;
                        case 5:
                            textView2.setText((a % b) + "");
                            break;
                        case 6:
                            textView2.setText(Math.pow(a, b) + "");
                            break;
                        default:
                            error.setError("error");
                    }
                }
                else
                {
                    error.setError("error");
                }
            }
        });

    }
}

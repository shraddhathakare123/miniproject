package com.example.miniproject;import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editTextTextPersonName;
    Button button ,button2,button3,button4,button5,button6,button7,button8,button9,button10,
            button11,button12,button13,button14,button15,button16,button17;
    int res1,res2;
    boolean add,sub,div,mult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=findViewById(R.id.textView);
        EditText editText=findViewById(R.id.editTextTextPersonName);
        Button button=findViewById(R.id.button);
        Button button2=findViewById(R.id.button2);
        Button button3=findViewById(R.id.button3);
        Button button4=findViewById(R.id.button4);
        Button button5=findViewById(R.id.button5);
        Button button6=findViewById(R.id.button6);
        Button button7=findViewById(R.id.button7);
        Button button8=findViewById(R.id.button8);
        Button button9=findViewById(R.id.button9);
        Button button10=findViewById(R.id.button10);
        Button button11=findViewById(R.id.button11);
        Button button12=findViewById(R.id.button12);
        Button button13=findViewById(R.id.button13);
        Button button14=findViewById(R.id.button14);
        Button button15=findViewById(R.id.button15);
        Button button16=findViewById(R.id.button16);
        Button button17=findViewById(R.id.button17);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"2");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"1");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (editText==null){
                   editText.setText("");
               }
               else {
                   res1=Integer.parseInt(editText.getText()+"");
                   add=true;
                   editText.setText(null);
               }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"3");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"4");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"5");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"6");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText==null){
                    editText.setText("");
                }
                else {
                    res1=Integer.parseInt(editText.getText()+"");
                    sub=true;
                    editText.setText(null);
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"9");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"8");
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"9");
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText==null){
                    editText.setText("");
                }
                else {
                    res1=Integer.parseInt(editText.getText()+"");
                    mult=true;
                    editText.setText(null);
                }
            }

        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+".");
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"0");
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               res2=Integer.parseInt(editText.getText()+"");
            if (add==true){
                editText.setText(res1+res2+"");
                add=false;
            }

                    res2=Integer.parseInt(editText.getText()+"");
                    if (sub==true){
                        editText.setText(res1-res2+"");
                        sub=false;
                    }

                        res2=Integer.parseInt(editText.getText()+"");
                        if (mult==true){
                            editText.setText(res1*res2+"");
                            mult=false;
                        }

                            res2=Integer.parseInt(editText.getText()+"");
                            if (div==true){
                                editText.setText(res1/res2+"");
                                div=false;
                            } }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText==null){
                    editText.setText("");
                }
                else {
                    res1=Integer.parseInt(editText.getText()+"");
                    div=true;
                    editText.setText(null);
                } }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }});
    }
}
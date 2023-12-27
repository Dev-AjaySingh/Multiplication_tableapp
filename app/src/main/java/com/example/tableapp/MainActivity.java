package com.example.tableapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btn,btn2;
    TextView tv;
    int i;

    String k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.et);
        btn=findViewById(R.id.btn);
        btn2=findViewById(R.id.btn2);
        tv=findViewById(R.id.tv);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                k="";
                Integer var= Integer.parseInt(et.getText().toString());
                for(i=1;i<=10;i++)
                {
                    k=k+(var+" x " +i+ " = " +(var*i)+"\n\n");

                    tv.setText(k);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("");
                et.setText("");
            }
        });

    }
}
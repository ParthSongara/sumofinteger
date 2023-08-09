package com.example.sumofinteger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity { 
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String msg = intent.getStringExtra("Addition");
        textView=findViewById(R.id.t1);
        textView.setText("Sum = "+msg);
    }
}
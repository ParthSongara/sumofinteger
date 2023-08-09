package com.example.sumofinteger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Double n1 = Double.parseDouble(e1.getText().toString());
                        Double n2 = Double.parseDouble(e2.getText().toString());
                        Double sum = n1+n2;
                        String m = Double.toString(sum);
                        Intent i= new Intent(getApplicationContext(),MainActivity2.class);
                                i.putExtra("Addition",m);
                                startActivity(i);

                    }
                });

    }
}
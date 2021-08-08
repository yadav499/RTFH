package com.example.hem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class fifth_acitivity extends AppCompatActivity implements View.OnClickListener {
TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_acitivity);
        tv1=findViewById(R.id.txt1);
        tv2=findViewById(R.id.txt2);
        tv3=findViewById(R.id.txt3);
        tv4=findViewById(R.id.txt4);
        tv5=findViewById(R.id.txt5);
        tv6=findViewById(R.id.txt6);
        tv7=findViewById(R.id.txt7);
        tv8=findViewById(R.id.txt8);
        tv9=findViewById(R.id.txt9);
        tv10=findViewById(R.id.txt10);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "wait..", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(fifth_acitivity.this,eight_activity.class);
        startActivity(intent);

    }
}
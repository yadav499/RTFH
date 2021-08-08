package com.example.hem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class eighteenth_activity extends AppCompatActivity implements View.OnClickListener {
TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighteenth);
        tv1=findViewById(R.id.tv);
        tv2=findViewById(R.id.tv1);
        tv3=findViewById(R.id.tv2);
        tv4=findViewById(R.id.tv3);
        tv5=findViewById(R.id.tv4);
        tv6=findViewById(R.id.tv5);
        tv7=findViewById(R.id.tv6);
        tv8=findViewById(R.id.tv7);
        tv9=findViewById(R.id.tv8);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent next=new Intent(eighteenth_activity.this,twentythree_activity.class);
        startActivity(next);
    }
}
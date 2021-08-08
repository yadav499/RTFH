package com.example.hem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class fourteen_activity extends AppCompatActivity {
TextView tv1,tv2,tv3,tv4,tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteen);
        tv1=findViewById(R.id.tv);
        tv2=findViewById(R.id.tv1);
        tv3=findViewById(R.id.tv2);
        tv4=findViewById(R.id.tv3);
        tv5=findViewById(R.id.tv4);
    }
}
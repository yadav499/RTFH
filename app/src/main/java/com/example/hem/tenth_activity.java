package com.example.hem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class tenth_activity extends AppCompatActivity implements View.OnClickListener {
TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15,tv16,tv17,tv18;
NestedScrollView nestedScrollView;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        tv1=findViewById(R.id.tv);
        tv2=findViewById(R.id.tv1);
        tv3=findViewById(R.id.tv2);
        tv4=findViewById(R.id.tv3);
        tv5=findViewById(R.id.tv4);
        tv6=findViewById(R.id.tv5);
        tv7=findViewById(R.id.tv6);
        tv8=findViewById(R.id.tv7);
        tv9=findViewById(R.id.tv8);
        tv10=findViewById(R.id.tv9);
        tv11=findViewById(R.id.tv10);
        tv12=findViewById(R.id.tv11);
        tv13=findViewById(R.id.tv12);
        tv14=findViewById(R.id.tv13);
        tv15=findViewById(R.id.tv14);
        tv16=findViewById(R.id.tv15);
        tv17=findViewById(R.id.tv16);
        tv18=findViewById(R.id.tv17);
        nestedScrollView=findViewById(R.id.nested_scrollview);
btn=findViewById(R.id.btn);
btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "wait..", Toast.LENGTH_SHORT).show();
        Intent nextinfo=new Intent(tenth_activity.this,eleventh_activity.class);
        startActivity(nextinfo);
    }
}
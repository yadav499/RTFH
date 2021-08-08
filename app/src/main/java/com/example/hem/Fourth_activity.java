package com.example.hem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Fourth_activity extends AppCompatActivity implements View.OnClickListener {
TextView tv1,tv2,tv3;
Button btn1, btn2,btn3,btn4,btn5, btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_acitivity);
        tv1=findViewById(R.id.tv4);
        tv2=findViewById(R.id.tv5);
        tv3=findViewById(R.id.tv6);
        btn1=findViewById(R.id.btn6);
        btn1.setOnClickListener(this);
        btn2=findViewById(R.id.btn7);
        btn2.setOnClickListener(this);
        btn3=findViewById(R.id.btn8);
        btn3.setOnClickListener(this);
        btn4=findViewById(R.id.btn9);
        btn4.setOnClickListener(this);
        btn5=findViewById(R.id.btn10);
        btn5.setOnClickListener(this);
        btn6=findViewById(R.id.btn11);
        btn6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn6:
                Toast.makeText(getApplicationContext(), "opening Covid-19....", Toast.LENGTH_SHORT).show();
                Intent intent2=new Intent(Fourth_activity.this,seven_activity.class);
                startActivity(intent2);
                break;
            case R.id.btn7:
                Toast.makeText(getApplicationContext(), "opening Cardiovascular disease....", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Fourth_activity.this,fifth_acitivity.class);
                startActivity(intent);
                break;
            case R.id.btn8:
                Toast.makeText(getApplicationContext(), "opening seasonal disease.....", Toast.LENGTH_SHORT).show();
                Intent seasonal=new Intent(Fourth_activity.this,tenth_activity.class);
                startActivity(seasonal);
                 break;
            case R.id.btn9:
                Toast.makeText(getApplicationContext(), "opening ....", Toast.LENGTH_SHORT).show();
                Intent depression=new Intent(Fourth_activity.this,seventeenth_activity.class);
                startActivity(depression);
                break;
            case R.id.btn10:
                Toast.makeText(getApplicationContext(), "Opening....", Toast.LENGTH_SHORT).show();
                Intent adhd=new Intent(Fourth_activity.this, eighteenth_activity.class);
                startActivity(adhd);
                break;
            case R.id.btn11:
                Toast.makeText(getApplicationContext(), "Opening...", Toast.LENGTH_SHORT).show();
                Intent posttraumatic=new Intent(Fourth_activity.this, ninteenth_activity.class);
                startActivity(posttraumatic);
                break;
        }
    }
}
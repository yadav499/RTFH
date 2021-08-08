package com.example.hem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class six_activity extends AppCompatActivity implements View.OnClickListener {
TextView tv1;
Button btn1,btn2,btn4,btn5;
ImageView img1, img2,img3,img4,img5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        tv1=findViewById(R.id.tv1);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);
        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        btn4=findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5=findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn1:
                Toast.makeText(getApplicationContext(), "Opening...", Toast.LENGTH_SHORT).show();
                Intent crossfit=new Intent(six_activity.this,twelvth_activity.class);
                startActivity(crossfit);
                break;
            case R.id.btn2:
                Toast.makeText(getApplicationContext(), "Opening....", Toast.LENGTH_SHORT).show();
                Intent yoga=new Intent(six_activity.this,twenty_activity.class);
                startActivity(yoga);
                break;

            case R.id.btn4:
                Toast.makeText(getApplicationContext(), "Opening.......", Toast.LENGTH_SHORT).show();
                Intent stretching=new Intent(six_activity.this,twentyone_activity.class);
                startActivity(stretching);
                break;
            case R.id.btn5:
                Toast.makeText(getApplicationContext(), "Opening......", Toast.LENGTH_SHORT).show();
                Intent absworkout=new Intent(six_activity.this,sixteenth_activity.class);
                startActivity(absworkout);
                break;

        }
    }
}
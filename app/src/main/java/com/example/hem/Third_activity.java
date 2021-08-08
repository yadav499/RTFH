package com.example.hem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Third_activity extends AppCompatActivity implements View.OnClickListener {
TextView tv;
Button btn4,btn5;
ImageView img;
public void startMyActivity(Intent intent){
    startActivity(intent);
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tv=findViewById(R.id.tv);
        img=findViewById(R.id.img2);
        btn4=findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5=findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn4){
            Toast.makeText(getApplicationContext(), "Opening..... ", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Third_activity.this,Fourth_activity.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(), "Opening.....", Toast.LENGTH_SHORT).show();
              Intent intent2=new Intent(this,six_activity.class);
              startActivity(intent2);
        }
    }
}
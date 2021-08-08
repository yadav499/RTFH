package com.example.hem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class nine_activity extends AppCompatActivity implements View.OnClickListener {
Button btn1,btn2,btn3,btn4;
ImageView img1,img2,img3,img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);
        img1=findViewById(R.id.imageView);
        img2=findViewById(R.id.imageView4);
        img3=findViewById(R.id.imageView6);
        img4=findViewById(R.id.imageView7);
        btn1=findViewById(R.id.button);
        btn1.setOnClickListener(this);
        btn2=findViewById(R.id.button5);
        btn2.setOnClickListener(this);
        btn3=findViewById(R.id.button6);
        btn3.setOnClickListener(this);
        btn4=findViewById(R.id.button4);
        btn4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Toast.makeText(getApplicationContext(), "opening...", Toast.LENGTH_SHORT).show();
                Intent internet=new Intent();
                internet.setAction(Intent.ACTION_VIEW);
                internet.addCategory(Intent.CATEGORY_BROWSABLE);
                internet.setData(Uri.parse("https://selfregistration.cowin.gov.in"));
                startActivity(internet);
                break;
            case R.id.button5:
                Toast.makeText(getApplicationContext(), "loading....", Toast.LENGTH_SHORT).show();
                Intent symptoms=new Intent(nine_activity.this,thirteen_activity.class);
                startActivity(symptoms);
                break;
            case R.id.button6:
                Toast.makeText(getApplicationContext(), "opening..", Toast.LENGTH_SHORT).show();
                Intent prevention= new Intent(nine_activity.this,fourteen_activity.class);
                startActivity(prevention);
                break;
            case R.id.button4:
                Toast.makeText(getApplicationContext(), "loading.....", Toast.LENGTH_SHORT).show();
                Intent treatment=new Intent(nine_activity.this,fifteen_activity.class);
                startActivity(treatment);
                break;
        }
    }
}
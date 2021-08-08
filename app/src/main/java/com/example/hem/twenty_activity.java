package com.example.hem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class twenty_activity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13;
    ImageView img1,img2,img3,img4,img5,img6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);
        tv6=findViewById(R.id.tv6);
        tv7=findViewById(R.id.tv7);
        tv8=findViewById(R.id.tv8);
        tv9=findViewById(R.id.tv9);
        tv10=findViewById(R.id.tv10);
        tv11=findViewById(R.id.tv11);
        tv12=findViewById(R.id.tv12);
        tv13=findViewById(R.id.tv13);
        img1=findViewById(R.id.imageView);
        img2=findViewById(R.id.imageView3);
        img3=findViewById(R.id.imageView4);
        img4=findViewById(R.id.imageView5);
        img5=findViewById(R.id.imageView6);
        img6=findViewById(R.id.imageView8);
    }
}
package com.example.hem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class twentyone_activity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13;
    ImageView img1,img2,img3,img4,img5,img6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentyone);
        tv1=findViewById(R.id.titlepage);
        tv2=findViewById(R.id.textView);
        tv3=findViewById(R.id.textView2);
        tv4=findViewById(R.id.textView3);
        tv5=findViewById(R.id.textView4);
        tv6=findViewById(R.id.textView5);
        tv7=findViewById(R.id.textView6);
        tv8=findViewById(R.id.textview7);
        tv9=findViewById(R.id.textView8);
        tv10=findViewById(R.id.textView9);
        tv11=findViewById(R.id.textView10);
        tv12=findViewById(R.id.textView11);
        tv13=findViewById(R.id.textView12);
        img1=findViewById(R.id.imageView2);
        img2=findViewById(R.id.imageView4);
        img3=findViewById(R.id.imageView5);
        img4=findViewById(R.id.imageView7);
        img5=findViewById(R.id.imageView8);
        img6=findViewById(R.id.imageView9);
    }
}
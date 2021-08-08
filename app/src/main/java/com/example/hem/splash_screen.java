package com.example.hem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_screen extends AppCompatActivity {
ImageView img;
TextView tv,tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        img=findViewById(R.id.img3);
        tv=findViewById(R.id.tv3);
        tv=findViewById(R.id.tv4);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Thread td=new Thread(){
          public void run(){
              try {
                  sleep(4000);
              }catch (Exception ex){
                  ex.printStackTrace();
              }finally {
                  Intent splash=new Intent(splash_screen.this,MainActivity.class);
                  startActivity(splash);
                  finish();
              }
          }
        };td.start();
    }
}
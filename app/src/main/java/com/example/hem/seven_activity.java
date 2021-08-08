package com.example.hem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class seven_activity extends AppCompatActivity implements View.OnClickListener {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8;
    Button btn1,btn2,btn3;
    ImageView img1,img2,img3,img4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
        tv1=findViewById(R.id.txt1);
        tv2=findViewById(R.id.txt2);
        tv3=findViewById(R.id.txt3);
        tv4=findViewById(R.id.textView4);
        tv5=findViewById(R.id.textView5);
        tv6=findViewById(R.id.textView6);
        tv7=findViewById(R.id.textview7);
        tv8=findViewById(R.id.textview8);
        img1=findViewById(R.id.imageView3);
        img2=findViewById(R.id.imageView4);
        img3=findViewById(R.id.imageView5);
        img4=findViewById(R.id.imageView6);
        btn1=findViewById(R.id.button);
        btn1.setOnClickListener(this);


        btn3=findViewById(R.id.button3);
        btn3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Toast.makeText(getApplicationContext(), "calling", Toast.LENGTH_SHORT).show();
                 String number=tv8.getText().toString();
                Intent call=new Intent();
                call.setAction(Intent.ACTION_CALL);

                call.setData(Uri.parse("tel:"+number));
                if
                (ActivityCompat.checkSelfPermission(seven_activity.this, Manifest.permission.CALL_PHONE)

                        != PackageManager.PERMISSION_GRANTED){
                    requestPermissions(new
                            String[]{Manifest.permission.CALL_PHONE},123
                    );
                }else {
                    startActivity(call);
                }

                break;

            case R.id.button3:
                Toast.makeText(getApplicationContext(), "wait...", Toast.LENGTH_SHORT).show();
                Intent moreinfo=new Intent(seven_activity.this,nine_activity.class);
                startActivity(moreinfo);
                break;
        }
    }
}
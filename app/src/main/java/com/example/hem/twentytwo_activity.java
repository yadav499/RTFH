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

public class twentytwo_activity extends AppCompatActivity implements View.OnClickListener {
TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8;
ImageView img;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twentytwo);
        tv1=findViewById(R.id.tv);
        tv2=findViewById(R.id.tv1);
        tv3=findViewById(R.id.tv2);
        tv4=findViewById(R.id.tv3);
        tv5=findViewById(R.id.tv4);
        tv6=findViewById(R.id.tv5);
        tv7=findViewById(R.id.tv6);
        tv8=findViewById(R.id.tv7);
        img=findViewById(R.id.img);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String number=tv8.getText().toString();
        Intent call=new Intent();
        call.setAction(Intent.ACTION_CALL);

        call.setData(Uri.parse("tel:"+number));
        if
        (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)

                != PackageManager.PERMISSION_GRANTED){
            requestPermissions(new
                    String[]{Manifest.permission.CALL_PHONE},123
            );
        }else {
            startActivity(call);
        }
    }
}
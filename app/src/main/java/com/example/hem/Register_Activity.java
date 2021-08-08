package com.example.hem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Register_Activity extends AppCompatActivity implements View.OnClickListener {
TextView tv1;
EditText edt1,edt2,edt3,edt4;
Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        tv1=findViewById(R.id.tv1);
        edt1=findViewById(R.id.edt_name);
        edt2=findViewById(R.id.edt_phone);
        edt3=findViewById(R.id.edt_email);
        edt4=findViewById(R.id.edt_address);

        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent =new Intent(Register_Activity.this, Register2_activity.class);
        startActivity(intent);
    }
}
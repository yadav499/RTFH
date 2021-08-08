package com.example.hem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Register2_activity extends AppCompatActivity implements View.OnClickListener {
TextView tv3;
RadioGroup rdo_grp;
RadioButton rdo1,rdo2,rdo3;
EditText edt1,edt2,edt3,edt4;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        tv3=findViewById(R.id.tv3);
        edt1=findViewById(R.id.edt_bloodgrp);
        edt2=findViewById(R.id.edt_age);
        edt3=findViewById(R.id.edt_height);
        edt4=findViewById(R.id.edt_weight);
        rdo_grp=findViewById(R.id.rdo_grp);
        rdo1=findViewById(R.id.rdo_male);
        rdo2=findViewById(R.id.rdo_female);
        rdo3=findViewById(R.id.rdo_other);
        btn=findViewById(R.id.btn3);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "you have registered succesfully", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(Register2_activity.this, Third_activity.class);
        startActivity(intent);


    }
}
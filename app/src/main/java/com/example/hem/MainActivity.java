package com.example.hem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    EditText edt1, edt2, edt3;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.img);
        edt1 = findViewById(R.id.edt_name);
        edt2 = findViewById(R.id.edt_email);
        edt3 = findViewById(R.id.edt_password);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        if (v.getId() == R.id.btn1) {
            Toast.makeText(getApplicationContext(), "you have logged in succesfully", Toast.LENGTH_SHORT).show();
            Intent intent1=new Intent(MainActivity.this, Third_activity.class);
            startActivity(intent1);
        }else {
            intent = new Intent(MainActivity.this, Register_Activity.class);
            startActivity(intent);
            finish();
        }


    }
}
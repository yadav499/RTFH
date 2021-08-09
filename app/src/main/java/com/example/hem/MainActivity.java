package com.example.hem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     TextView tv;
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
        tv=findViewById(R.id.tv1);
        tv.setOnClickListener(this);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv1:
                Intent internet=new Intent();
                internet.setAction(Intent.ACTION_VIEW);
                internet.addCategory(Intent.CATEGORY_BROWSABLE);
                internet.setData(Uri.parse("https://accounts.google.com/signin/v2/challenge/az?continue=https%3A%2F%2Fmyaccount.google.com%2Fsigninoptions%2Fpassword%3Fpli%3D1&service=accountsettings&osid=1&rart=ANgoxcfOjlFZ6e_ALX0Uimbz739zkNm6an1oIca9hxqsmJ1NI0OeO9soWxDe9Gi1_Yk4gYcYDXVM9NULiKXrVH7vamHTNP4sRQ&TL=AM3QAYapgY07RPxoi2mUuIjt4wraXxmywEmngq2fGYfQtLSfeAJePTK2qH2zswkO&flowName=GlifWebSignIn&cid=4&flowEntry=ServiceLogin"));
                startActivity(internet);
                break;
            case R.id.btn1:
                Toast.makeText(getApplicationContext(), "you have logged in succesfully", Toast.LENGTH_SHORT).show();
                Intent intent1=new Intent(MainActivity.this, Third_activity.class);
                startActivity(intent1);
               break;
            case R.id.btn2:
              Intent  intent = new Intent(MainActivity.this, Register_Activity.class);
                startActivity(intent);
                finish();

        }



    }
}
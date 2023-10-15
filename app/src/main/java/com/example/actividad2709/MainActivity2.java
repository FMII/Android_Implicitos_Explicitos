package com.example.actividad2709;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3, btn4, btn5, btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        if (view.getId() == R.id.btn1) {
            intent = new Intent(MainActivity2.this, HxH.class);
            startActivity(intent);
        } else if (view.getId() == R.id.btn2) {
            intent = new Intent(MainActivity2.this, JujutsuKaisen.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btn3) {
            intent = new Intent(MainActivity2.this, Windbreaker.class);
            startActivity(intent);
        } else if (view.getId() == R.id.btn4) {
            String url = "https://www.facebook.com/Irianamolina23?mibextid=ZbWKwL";
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        }
        if (view.getId() == R.id.btn5) {
            String url = "https://www.youtube.com/watch?v=LExSwglVFIw";
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        } else if (view.getId() == R.id.btn6) {
            String url = "https://www.google.com.mx/maps/place/Shibuya,+Tokio,+Jap%C3%B3n/@35.666855,139.6514162,13z/data=!3m1!4b1!4m6!3m5!1s0x60188cb2eb3108d1:0xf11cd9b2395b6677!8m2!3d35.6619707!4d139.703795!16zL20vMDEyeGt5?entry=ttu";
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        }
    }
}
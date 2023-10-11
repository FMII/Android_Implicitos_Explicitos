package com.example.actividad2709;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button B;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B= findViewById(R.id.btn1);
        text = findViewById(R.id.text);
    }

    @Override
    public void onClick(View view) {

        CountDownTimer contador = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long l) {
                text.setText(""+ l/1000);

            }
            @Override
            public void onFinish() {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        };
        contador.start();
    }
}

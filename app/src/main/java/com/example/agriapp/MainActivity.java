package com.example.agriapp;
// MainActivity.java
// MainActivity.java
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonLogin1;
    private Button buttonLogin2;
    private Button buttonLogin3;
    private Button buttonLogin4;
    private Button buttonLogin5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin1 = findViewById(R.id.buttonLogin1);
        buttonLogin2 = findViewById(R.id.buttonLogin2);
        buttonLogin3 = findViewById(R.id.buttonLogin3);
        buttonLogin4 = findViewById(R.id.buttonLogin4);
        buttonLogin5 = findViewById(R.id.buttonLogin5);

        buttonLogin1.setOnClickListener(this);
        buttonLogin2.setOnClickListener(this);
        buttonLogin3.setOnClickListener(this);
        buttonLogin4.setOnClickListener(this);
        buttonLogin5.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonLogin1:
                Intent intent1 = new Intent(this, Login1Activity.class);
                startActivity(intent1);
                break;
            case R.id.buttonLogin2:
                Intent intent2 = new Intent(this, Login2Activity.class);
                startActivity(intent2);
                break;
            case R.id.buttonLogin3:
                Intent intent3 = new Intent(this, Login3Activity.class);
                startActivity(intent3);
                break;
            case R.id.buttonLogin4:
                Intent intent4 = new Intent(this, Login4Activity.class);
                startActivity(intent4);
                break;
            case R.id.buttonLogin5:
                Intent intent5 = new Intent(this, Login5Activity.class);
                startActivity(intent5);
                break;
        }
    }
}

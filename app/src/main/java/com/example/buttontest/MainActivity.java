package com.example.buttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View view) {

        switch(view.getId())
        {
            case R.id.sayHelloButton:
                Toast.makeText(this, "Say Hello Button Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.sayByeButton:
                Toast.makeText(this, "Say Bye Button Clicked", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.sayHelloButton);


        button.setOnClickListener(this);

        Button button1 = findViewById(R.id.sayByeButton);
        button1.setOnClickListener(this);
    }


}
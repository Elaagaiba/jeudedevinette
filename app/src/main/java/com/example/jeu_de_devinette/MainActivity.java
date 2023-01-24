package com.example.jeu_de_devinette;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText et_deviner;
    Button btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_deviner = findViewById(R.id.et_deviner);
        btn_ok = findViewById(R.id.btn_Ok);
        int max=14,min=10;
        Random rand = new Random();
        int value = rand.nextInt((max - min) + 1) + min;

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int  n1 = Integer.parseInt(et_deviner.getText().toString()),
                n2=value;

                if (n1==n2){
                    Toast.makeText(MainActivity.this, "bravo", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "non", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
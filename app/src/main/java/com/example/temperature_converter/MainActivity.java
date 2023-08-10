package com.example.temperature_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3;
    EditText e1;
    Button b1;
    ImageView img,img1,img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        b1=findViewById(R.id.b1);
        img=findViewById(R.id.img);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        e1=findViewById(R.id.e1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double celsius=Double.parseDouble(e1.getText().toString());
                t1.setText(celsius+"C");
                double farenheit=(celsius*1.8)+32;
                t2.setText(farenheit+"F");
                double kelvin=celsius+273.15;
                t3.setText(kelvin+"K");
            }
        });
    }
}
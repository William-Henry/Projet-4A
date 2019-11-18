package com.example.projet.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.projet.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView raceName = findViewById(R.id.raceName);
        TextView round = findViewById(R.id.round);
        TextView circuitName = findViewById(R.id.circuitName);
        TextView locality = findViewById(R.id.locality);
        TextView country = findViewById(R.id.country);
        TextView circuiturl = findViewById(R.id.circuiturl);
        Intent intent = getIntent();
        raceName.setText(intent.getStringExtra("raceName"));
        round.setText(intent.getStringExtra("round"));
        circuitName.setText(intent.getStringExtra("circuitName"));
        locality.setText(intent.getStringExtra("locality"));
        country.setText(intent.getStringExtra("country"));
        circuiturl.setText(intent.getStringExtra("circuiturl"));
    }
}

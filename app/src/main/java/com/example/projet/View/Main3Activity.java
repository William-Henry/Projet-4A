package com.example.projet.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projet.Model.F1;
import com.example.projet.R;
import com.squareup.picasso.Picasso;


public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView team = findViewById(R.id.team);
        Intent intent = getIntent();
        team.setText(intent.getStringExtra("team"));

    }
}

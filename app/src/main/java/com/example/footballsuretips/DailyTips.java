package com.example.footballsuretips;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class  DailyTips extends AppCompatActivity {

    RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_tips);
        recyclerview = findViewById(R.id.recyclerview_dailytips);

    }}
package com.example.footballsuretips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button DailyTipsButton = (Button)findViewById(R.id.DailyTipsbutton);
        DailyTipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),DailyTips.class);
                startActivity(startIntent);
            }
        });
        Button PreviousMatchesButton = (Button)findViewById(R.id.PreviousMatchesbutton);
        PreviousMatchesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),PreviousMatches.class);
                startActivity(startIntent);
            }
        });
        Button GGNGTipsButton = (Button)findViewById(R.id.GGNGTipsbutton);
        GGNGTipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),GGNGTips.class);
                startActivity(startIntent);
            }
        });
        Button JackpotTipsButton = (Button) findViewById(R.id.JackpotTipsbutton);
        JackpotTipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),JackpotTips.class);
                startActivity(startIntent);
            }
        });
        Button DoubleChanceTipsButton = (Button)findViewById(R.id.DoubleChancebutton);
        DoubleChanceTipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),DoubleChanceTips.class);
                startActivity(startIntent);
            }
        });
        Button DailySafeGameButton = (Button)findViewById(R.id.DailySafeGamebutton);
        DailySafeGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),DailySafeGame.class);
                startActivity(startIntent);
            }
        });

    }
}
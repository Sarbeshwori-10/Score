package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int teamAScore;
    private int teamBScore;
    private TextView ScoreA;
    private TextView ScoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScoreA = findViewById(R.id.text0);
        ScoreB = findViewById(R.id.text1);
    }

    public void AOnePlus(View view) {
        teamAScore += 1;
        displayAScore(teamAScore);
    }

    public void ATwoPlus(View view) {
        teamAScore += 2;
        displayAScore(teamAScore);
    }

    public void AThreePlus(View view) {
        teamAScore += 3;
        displayAScore(teamAScore);
    }

    public void BOnePlus(View view) {
        teamBScore += 1;
        displayBScore(teamBScore);

    }

    public void BTwoPlus(View view) {
        teamBScore += 2;
        displayBScore(teamBScore);
    }

    public void BThreePlus(View view) {
        teamBScore += 3;
        displayBScore(teamBScore);
    }

    public void displayAScore(int teamAScore) {
        ScoreA.setText(String.valueOf(teamAScore));
    }

    public void displayBScore(int teamBScore) {
        ScoreB.setText(String.valueOf(teamBScore));
    }

    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayAScore(teamAScore);
        displayBScore(teamBScore);

    }
}
//
//        refreshButton.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view){
//                count++;
//                textView.setText(""+count);
//                Log.d(TAG, msg: ""+count);
//
//            }
//        });
//
//
//
//        cancelButton.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view){
//                textView.setText("");
//            }
//        });
//
//        submitButton.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view){
//                Toast.makeText(MainActivity.this, "This is a toast", Toast.LENGTH_LONG).show();
//            }
//        });

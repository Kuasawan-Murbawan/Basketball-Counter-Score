package com.example.practiceset2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view){
        scoreTeamA =0;
        scoreTeamB =0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void threePoint(View view){
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }

    public void twoPoint(View view){
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    public void freethrow(View view){
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }

    public void threePointB(View view){
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointB(View view){
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }

    public void freethrowB(View view){
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

}
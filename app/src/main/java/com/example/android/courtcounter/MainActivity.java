package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //display function for team A

    private void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    // onClick function for 3 pointer in team A
    public void addThreeTeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    // onClick function for 2 pointer in team A

    public void addTwoTeamA(View view) {
        scoreTeamA +=2;
        displayForTeamA(scoreTeamA);
    }

    // onClick function for 1 pointer in team A

    public void addOneTeamA(View view) {
        scoreTeamA +=1;
        displayForTeamA(scoreTeamA);

    }

    // display function for team B

    private void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    // onClick function for 3 pointer in team B
    public void addThreeTeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    // onClick function for 2 pointer in team B
    public void addTwoTeamB(View view) {
        scoreTeamB +=2;
        displayForTeamB(scoreTeamB);
    }

    // onClick function for 1 pointer in team B

    public void addOneTeamB(View view) {
        scoreTeamB +=1;
        displayForTeamB(scoreTeamB);
    }

    // onClick function to reset the score of both teams

    public void resetScore(View view){
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}

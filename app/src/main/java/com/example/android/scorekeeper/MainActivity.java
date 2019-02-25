package com.example.android.scorekeeper;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int SCORE_TD = 6;
    final int SCORE_FG = 3;
    final int SCORE_XP = 1;
    final int SCORE_SF = 2;

    int awayScore = 0;
    int homeScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize the displayed scores
        displayScores();
    }

    // add 6 points to away team score
    public void awayTD(View v) {
        awayScore += SCORE_TD;
        displayScores();
    }

    // add 1 point to away team score
    public void awayXtra(View v) {
        awayScore += SCORE_XP;
        displayScores();
    }

    // add 3 points to away team score
    public void awayFG(View v) {
        awayScore += SCORE_FG;
        displayScores();
    }

    // add 2 points to away team score
    public void awaySafety(View v) {
        awayScore += SCORE_SF;
        displayScores();
    }

    // add 6 points to home team score
    public void homeTD(View v) {
        homeScore += SCORE_TD;
        displayScores();
    }

    // add 1 point to home team score
    public void homeXtra(View v) {
        homeScore += SCORE_XP;
        displayScores();
    }

    // add 3 points to home team score
    public void homeFG(View v) {
        homeScore += SCORE_FG;
        displayScores();
    }

    // add 2 points to home team score
    public void homeSafety(View v) {
        homeScore += SCORE_SF;
        displayScores();
    }

    // zero the home and away scores
    public void resetScore(View v) {
        awayScore = 0;
        homeScore = 0;
        displayScores();
    }

    // update both scores.  We could do separate methods for each, but this is
    // easier and no real performance hit
    public void displayScores() {
        TextView scoreViewAway = (TextView) findViewById(R.id.away_score);
        TextView scoreViewHome = (TextView) findViewById(R.id.home_score);
        scoreViewAway.setText(String.valueOf(awayScore));
        scoreViewHome.setText(String.valueOf(homeScore));
    }
}

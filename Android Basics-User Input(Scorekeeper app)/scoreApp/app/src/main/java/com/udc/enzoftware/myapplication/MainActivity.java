package com.udc.enzoftware.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    final int INCREMENT_TOUCHDOWN = 6;
    final int FIELD_GOLD_INCREMENT = 3;
    final int EXTRA_POINT_INCREMENT1 = 1;
    final int EXTRA_POINT_INCREMENT2 = 2;
    final int SAFETY_INCREMENT = 2;

    int scoreTeamA = 0 , scoreTeamB = 0;
    TextView aScoreTeam, bScoreTeam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aScoreTeam = (TextView) findViewById(R.id.scoreTeamA);
        bScoreTeam = (TextView) findViewById(R.id.scoreTeamB);
    }


    public void changeScore(View v){
        switch (v.getId()){
            case R.id.touchdownA :
                scoreTeamA += INCREMENT_TOUCHDOWN;
                break;
            case R.id.touchdownB :
                scoreTeamB += INCREMENT_TOUCHDOWN;
                break;
            case R.id.fieldGoldA:
                scoreTeamA += FIELD_GOLD_INCREMENT;
                break;
            case R.id.fieldGoldB :
                scoreTeamB += FIELD_GOLD_INCREMENT;
                break;
            case R.id.extraPointA1:
                scoreTeamA += EXTRA_POINT_INCREMENT1;
                break;
            case R.id.extraPointA2 :
                scoreTeamA += EXTRA_POINT_INCREMENT2;
                break;
            case R.id.extraPointB1 :
                scoreTeamB += EXTRA_POINT_INCREMENT1;
                break;
            case R.id.extraPointB2 :
                scoreTeamB += EXTRA_POINT_INCREMENT2;
                break;
            case R.id.safetyA :
                scoreTeamA += SAFETY_INCREMENT;
                break;
            case R.id.safetyB :
                scoreTeamB += SAFETY_INCREMENT;
                break;
            case  R.id.resetButton :
                scoreTeamA = 0;
                scoreTeamB = 0;
                break;
        }

        updateScoreTeamA(scoreTeamA);
        updateScoreTeamB(scoreTeamB);
    }

    public void updateScoreTeamA(int actualScore){
        aScoreTeam.setText(String.valueOf(actualScore));
    }

    public void updateScoreTeamB(int actualScore){
        bScoreTeam.setText(String.valueOf(actualScore));
    }



}



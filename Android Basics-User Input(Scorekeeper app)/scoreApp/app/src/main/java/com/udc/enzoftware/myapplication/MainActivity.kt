package com.udc.enzoftware.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val INCREMENT_TOUCHDOWN = 6
    val FIELD_GOLD_INCREMENT = 3
    val EXTRA_POINT_INCREMENT1 = 1
    val EXTRA_POINT_INCREMENT2 = 2
    val SAFETY_INCREMENT = 2

    var scoreTeama = 0
    var scoreTeamb = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun changeScore(v: View) {
        when (v.id) {
            R.id.touchdownA -> scoreTeama += INCREMENT_TOUCHDOWN
            R.id.touchdownB -> scoreTeamb += INCREMENT_TOUCHDOWN
            R.id.fieldGoldA -> scoreTeama += FIELD_GOLD_INCREMENT
            R.id.fieldGoldB -> scoreTeamb += FIELD_GOLD_INCREMENT
            R.id.extraPointA1 -> scoreTeama += EXTRA_POINT_INCREMENT1
            R.id.extraPointA2 -> scoreTeama += EXTRA_POINT_INCREMENT2
            R.id.extraPointB1 -> scoreTeamb += EXTRA_POINT_INCREMENT1
            R.id.extraPointB2 -> scoreTeamb += EXTRA_POINT_INCREMENT2
            R.id.safetyA -> scoreTeama += SAFETY_INCREMENT
            R.id.safetyB -> scoreTeamb += SAFETY_INCREMENT
            R.id.resetButton -> {
                scoreTeama = 0
                scoreTeamb = 0
            }
        }

        updateScoreTeamA(scoreTeama)
        updateScoreTeamB(scoreTeamb)
    }

    fun updateScoreTeamA(actualScore: Int) {
        scoreTeamA.text = actualScore.toString()
    }

    fun updateScoreTeamB(actualScore: Int) {
        scoreTeamB.text = actualScore.toString()
    }
}



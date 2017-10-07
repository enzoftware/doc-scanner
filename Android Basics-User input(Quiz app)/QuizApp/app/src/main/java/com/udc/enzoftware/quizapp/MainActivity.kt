package com.udc.enzoftware.quizapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var correctAnswers = 0
    val answerNedved = "Nedved"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitButton.setOnClickListener {
            if (radioGermany.isChecked ) correctAnswers++
            if (radioSuker.isChecked) correctAnswers++
            if (answerInputNedved.text.toString() == answerNedved) correctAnswers++
            if (radio1982.isChecked) correctAnswers++
            if (checkPeruA.isChecked || checkPeruB.isChecked || checkPeruC.isChecked ) correctAnswers++
            Toast.makeText(this,"You have $correctAnswers / 5 correct answers :v ",Toast.LENGTH_LONG).show()
            correctAnswers = 0
        }
    }
}

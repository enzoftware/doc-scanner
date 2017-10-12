package com.udc.enzoftware.birthdaycard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text = true
        val description = resources.getString(R.string.description )
        val name = resources.getString(R.string.name)
        dynamicText.setOnClickListener {
            if(text){
                dynamicText.text = description
                dynamicText.textSize = 20.toFloat()
                text = false
            }else{
                dynamicText.text = name
                dynamicText.textSize = 29.toFloat()
                text = true
            }

        }
    }
}

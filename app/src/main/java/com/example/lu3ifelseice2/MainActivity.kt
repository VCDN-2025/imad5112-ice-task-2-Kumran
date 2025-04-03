package com.example.lu3ifelseice2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
// declarations include edittext, button and textview
        val speedText = findViewById<EditText>( R.id.speedText)

        val enterButton = findViewById<Button>(R.id.enterButton)

        val displayView = findViewById<TextView>(R.id.displayView)

        enterButton.setOnClickListener {
//speed stores user input
            val speed = speedText.text.toString().toInt()
// if speed is less than 60 then the driver is driving safely
            if (speed < 60 ) {
                displayView.text = "You are driving safely"
// if speed is between 60 and 80 then the driver is driving carefully
            } else if (speed >= 60 && speed <=  80) {
                displayView.text = "Warning! Drive safely!"
// if speed is between 81 and 100 then the driver is above speed limit and will be fined R500
            } else if (speed >= 81 && speed <= 100) {
                displayView.text = "Fine: R500"
// if speed is above 101 then the driver will be fined R2000
            } else if (speed >= 101) {
                displayView.text = "Fine: R2000"
// if speed is invalid then error message wil pop up
            } else{
                displayView.text = "Please enter correct speed!"

            }

        }



    }
}

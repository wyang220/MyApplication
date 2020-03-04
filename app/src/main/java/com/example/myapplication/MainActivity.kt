package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextClock
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    // for random number
    /*
    private fun rollDice(){
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random() //random number 1-6
        resultText.text = randomInt.toString()

        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }*/

    private fun rollDice(){
        val resultText: TextView = findViewById(R.id.result_text)
        val num = 0
        resultText.text = num.toString()

        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }
}

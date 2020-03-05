package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
    }

    private fun rollDice() {
       // val resultText: TextView = findViewById(R.id.result_text)
       // val randomInt = (1..6).random() //random number 1-6
       // resultText.text = randomInt.toString()

//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()

        val diceImage: ImageView = findViewById(R.id.dice_image)

        diceImage.setImageResource(imagerand())
        diceImage2.setImageResource(imagerand())

//        val drawableResource = when (randomInt) {
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }

        //diceImage.setImageResource(drawableResource)
    }

    private fun imagerand(): Int
    {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

//    private fun countUp() {
//        val resultText: TextView = findViewById(R.id.result_text)
//
//        //if text is the default "Hello Wolrd" set that to 1
//        if (resultText.text == "Hello World") {
//            resultText.text = "1"
//        } else {
//            // Othersive, increament the number up to 6.
//            //The text value in resultText.text is an rostance of the CharSequence class;
//            //it need to be converted to a String object before it can be converted to an int.
//            var resultInt = resultText.text.toString().toInt()
//
//            if (resultInt < 6) {
//                resultInt++
//                resultText.text = resultInt.toString()
//            }
//        }
//    }

}

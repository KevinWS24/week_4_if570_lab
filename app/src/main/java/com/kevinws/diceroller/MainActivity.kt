package com.kevinws.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
//            val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text = "6"

//            val toast = Toast.makeText(this, "Dice Rolled!",
//                Toast.LENGTH_SHORT)
//            toast.show()
//            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
        }

    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_2)
    }
}
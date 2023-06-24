package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.diceroller.Dice.Companion.createCubeDice

class MainActivity : AppCompatActivity() {
    val diceImages = listOf(
        R.drawable.dice_1,
        R.drawable.dice_2,
        R.drawable.dice_3,
        R.drawable.dice_4,
        R.drawable.dice_5,
        R.drawable.dice_6,
    )
    val dice = createCubeDice()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Button in the layout
        val rollButton: Button = findViewById(R.id.button)
        val diceImage: ImageView = findViewById(R.id.imageView)

        // Set a click listener on the button to roll the dice when the user taps the button
        rollButton.setOnClickListener { rollDice(diceImage) }
    }

    private fun rollDice(diceImage: ImageView) {
        // Create new Dice object with 6 sides and roll it

        val diceRoll: Int = dice.roll()

        // Update the screen with the dice roll
        diceImage.setImageResource(diceImages[diceRoll])

    }
}


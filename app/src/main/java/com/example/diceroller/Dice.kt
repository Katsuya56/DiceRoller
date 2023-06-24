package com.example.diceroller

/**
 * Dice with a fixed number of sides.
 */
class Dice(private val numSides: Int) {
    companion object {
        fun createCubeDice(): Dice{
            return Dice(6)
        }
    }

    /**
     * Do a random dice roll and return the result.
     */
    fun roll(): Int {
        return (1..numSides).random()
    }
}
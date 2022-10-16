package com.bahrun.my_app.GameManager

import com.bahrun.my_app.R
import kotlin.random.Random

class Game {

    private val option = listOf("ROCK", "SCISSORS", "PAPER")

    private val rulesGame = mapOf(
        "ROCK - SCISSORS" to true,
        "ROCK - PAPER" to false,

        "PAPER - ROCK" to true,
        "PAPER - SCISSORS" to false,

        "SCISSORS - PAPER" to true,
        "SCISSORS - ROCK" to false
    )
    private val optionImageButton = mapOf(

        "ROCK" to R.id.ib_rock_right,

        "SCISSORS" to R.id.ib_scissors_right,

        "PAPER" to R.id.ib_paper_right
    )

    fun pickComputerRandom() = option [Random.nextInt(0,3)]

    fun pickImageButtonRight() = optionImageButton

    fun isDraw(from: String, to: String): Boolean = from == to

    fun isWin(from: String, to: String): Boolean = rulesGame["$from - $to"]!!

    fun computer(){
        pickComputerRandom()
        pickImageButtonRight()
    }

}

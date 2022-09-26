package com.bahrun.my_app

import kotlin.random.Random

object Game {

    //2 bikin kayak if else tetapi memakai mapOf()
    private val rulesGame = mapOf(
        "ROCK - SCISSORS" to true,
        "ROCK - PAPER" to false,

        "SCISSORS - PAPER" to true,
        "SCISSORS - ROCK" to false,

        "PAPER - ROCK" to true,
        "PAPER - SCISSORS" to false
    )
    //3 menentukan pilihan random yang hanya ada di listOf()
    private val option = listOf("ROCK", "SCISSORS", "PAPER")

    //4 mengambil gambar pada drawable
    private val optionImageButton = mapOf(

        "ROCK" to R.id.ib_rock_right,

        "SCISSORS" to R.id.ib_scissors_right,

        "PAPER" to R.id.ib_paper_right
    )

    //1 menentukan enemy random
    fun pickRandomOption(): String = option [Random.nextInt(0,3)]

    fun pickImageButtonRight(option: String): Int = optionImageButton[option]!!

    fun isDraw(from: String, to: String): Boolean = from == to

    fun isWin(from: String, to: String): Boolean = rulesGame["$from - $to"]!!

}
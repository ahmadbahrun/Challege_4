package com.bahrun.my_app

import android.os.Bundle
import android.os.VibrationAttributes
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {

    private lateinit var computerImageButton: ImageButton

    private lateinit var rockImageButton : ImageButton
    private lateinit var scissorsImageButton : ImageButton
    private lateinit var paperImageButton : ImageButton
    private lateinit var resultImageView : ImageView
    private lateinit var refreshImageButton: ImageButton

    /*private lateinit var rockImageButtonRight : ImageButton
    private lateinit var scissorsImageButtonRight : ImageButton
    private lateinit var paperImageButtonRight : ImageButton*/


    private fun initComponent(){


        rockImageButton = findViewById(R.id.ib_rock_left)
        scissorsImageButton = findViewById(R.id.ib_scissors_left)
        paperImageButton = findViewById(R.id.ib_paper_left)
        resultImageView = findViewById(R.id.iv_result)
        refreshImageButton = findViewById(R.id.ib_refresh)

    }

    private fun initListener(){
        //mengatur ketika icon dipilih maka harus sesuai dengan apa yg dipilih
        rockImageButton.setOnClickListener {startGame("ROCK")  }
        scissorsImageButton.setOnClickListener { startGame("SCISSORS") }
        paperImageButton.setOnClickListener { startGame("PAPER") }
    }
    private fun startGame(option: String){
        val computerOption = Game.pickRandomOption()

                //tidak ada eror tetapi ketika di run for close?
        //computerImageButton.setOnClickListener { Game.pickImageButtonRight(option) }

        when{//Menampilkan hasil antara user dengan computer
            Game.isDraw(option, computerOption) -> resultImageView.setImageResource(R.drawable.ic_draw)
            Game.isWin(option, computerOption) -> resultImageView.setImageResource(R.drawable.ic_winner)
            else -> resultImageView.setImageResource(R.drawable.ic_lose)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_activity)

        initComponent()
        initListener()
    }
}
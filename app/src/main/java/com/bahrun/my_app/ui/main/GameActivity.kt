package com.bahrun.my_app.ui.main

import android.app.GameManager
import android.os.Bundle
import android.os.VibrationAttributes
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.MotionEffect.TAG
import com.bahrun.my_app.GameManager.Game
import com.bahrun.my_app.databinding.GameActivityBinding

class GameActivity : AppCompatActivity() {
    private val binding : GameActivityBinding by lazy {
        GameActivityBinding.inflate(layoutInflater)
    }
    private val useCase : Game by lazy {
        Game()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(binding.root)
        initGame()
    }
    private fun initGame(){
        binding.ibRockLeft.setOnClickListener { startGame() }
        binding.ibPaperLeft.setOnClickListener { startGame() }
        binding.ibScissorsLeft.setOnClickListener { startGame() }
        binding.ibRefresh.setOnClickListener { initGame() }
    }
    private fun startGame(){
        val computerOption = useCase.computer()
    }
}
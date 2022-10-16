package com.bahrun.my_app.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bahrun.my_app.R
import com.bahrun.my_app.databinding.ActivityMenuPageBinding

class MenuPage : AppCompatActivity() {
    private val binding : ActivityMenuPageBinding by lazy {
        ActivityMenuPageBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
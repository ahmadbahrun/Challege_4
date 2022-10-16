package com.bahrun.my_app.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SliderData(
    val desc : String,
    val imgSlider : String
) : Parcelable

package com.example.belajarandroid.model

import androidx.annotation.DrawableRes

data class SmartExpenseNote(
    val nama: String,
    val deskripsi: String,
    val harga: Int,
    @DrawableRes val imageRes: Int
)
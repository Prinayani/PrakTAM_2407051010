package com.example.belajarandroid.model

import com.example.belajarandroid.R

object ExpenseSource {
    val dummyExpenses = listOf(
        SmartExpenseNote("Makan Siang", "Udang Saus Padang", 100000, R.drawable.makan),
        SmartExpenseNote("Bus Kota", "Tiket Perjalanan Harian", 35000, R.drawable.transport),
        SmartExpenseNote("Tiket Bianglala", "Pasar Malam Minggu", 20000, R.drawable.hiburan),
        SmartExpenseNote("Skincare Rutin", "Beli Sunscreen & Moisturizer", 80000, R.drawable.belanja),
        SmartExpenseNote("Toko Buku", "Beli Buku Catatan Kuliah", 30000, R.drawable.pendidikan),
        SmartExpenseNote("Caramel Latte", "Ngopi di Cafe", 45000, R.drawable.jajan)
    )
}
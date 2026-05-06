package com.example.belajarandroid

import model.SmartExpenseNote
import retrofit2.http.GET

interface ApiService {
    @GET("prnyynii-hub/93e91039f1c31f1fb1eb1e1f41bec361/raw/7a1178cc0d827c7ccfe2ed8758f353d38a2fb08d/expenses.json")
    suspend fun getExpenses(): List<SmartExpenseNote>
}
package model

import com.google.gson.annotations.SerializedName

data class SmartExpenseNote(
    @SerializedName("id")
    val id: Int,

    @SerializedName("title")
    val nama: String,

    @SerializedName("description")
    val deskripsi: String,

    @SerializedName("amount")
    val harga: String,

    @SerializedName("imageUrl")
    val imageUrl: String
)
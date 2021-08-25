package ru.jelezov.formula1.data.remote.retrofit.responce.topDrivers

import androidx.room.Entity

@Entity
data class Constructor(
    val constructorId: String,
    val name: String,
    val nationality: String,
    val url: String
)
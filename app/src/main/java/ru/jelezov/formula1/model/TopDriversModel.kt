package ru.jelezov.formula1.model

data class TopDriversModel (
    val driver_name: String,
    val nationality: String,
    val points: Int,
    val position: Int,
    val team_name: String,
)
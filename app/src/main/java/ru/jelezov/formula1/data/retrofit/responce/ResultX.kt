package ru.jelezov.formula1.data.retrofit.responce

data class ResultX(
    val driver_id: Int,
    val driver_name: String,
    val is_reserve: Int,
    val nationality: String,
    val points: Int,
    val position: Int,
    val season: Int,
    val team_id: Int,
    val team_name: String,
    val updated: String
)
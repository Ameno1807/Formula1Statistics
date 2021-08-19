package ru.jelezov.formula1.data.retrofit.responce

data class Result(
    val points: Int,
    val position: Int,
    val season: Int,
    val team_id: Int,
    val team_name: String
)
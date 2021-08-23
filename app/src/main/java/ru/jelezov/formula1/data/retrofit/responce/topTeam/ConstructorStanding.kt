package ru.jelezov.formula1.data.retrofit.responce.topTeam

data class ConstructorStanding(
    val Constructor: Constructor,
    val points: String,
    val position: String,
    val positionText: String,
    val wins: String
)
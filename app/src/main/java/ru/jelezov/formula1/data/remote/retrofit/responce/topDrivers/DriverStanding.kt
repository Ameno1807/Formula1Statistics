package ru.jelezov.formula1.data.remote.retrofit.responce.topDrivers

data class DriverStanding(
    val Constructors: List<Constructor>,
    val Driver: Driver,
    val points: String,
    val position: String,
    val positionText: String,
    val wins: String
)
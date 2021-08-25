package ru.jelezov.formula1.data.remote.retrofit.responce.topDrivers

data class StandingsLists(
    val DriverStandings: List<DriverStanding>,
    val round: String,
    val season: String
)
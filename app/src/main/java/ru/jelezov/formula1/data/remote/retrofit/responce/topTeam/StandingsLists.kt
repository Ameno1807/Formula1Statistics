package ru.jelezov.formula1.data.remote.retrofit.responce.topTeam

data class StandingsLists(
    val ConstructorStandings: List<ConstructorStanding>,
    val round: String,
    val season: String
)
package ru.jelezov.formula1.data.retrofit.responce.topTeam

data class StandingsLists(
    val ConstructorStandings: List<ConstructorStanding>,
    val round: String,
    val season: String
)
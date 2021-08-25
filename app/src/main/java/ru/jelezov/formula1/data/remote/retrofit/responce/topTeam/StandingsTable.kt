package ru.jelezov.formula1.data.remote.retrofit.responce.topTeam

data class StandingsTable(
    val StandingsLists: List<StandingsLists>,
    val season: String
)
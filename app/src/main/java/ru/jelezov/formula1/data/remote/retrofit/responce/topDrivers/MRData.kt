package ru.jelezov.formula1.data.remote.retrofit.responce.topDrivers

data class MRData(
    val StandingsTable: StandingsTable,
    val limit: String,
    val offset: String,
    val series: String,
    val total: String,
    val url: String,
    val xmlns: String
)
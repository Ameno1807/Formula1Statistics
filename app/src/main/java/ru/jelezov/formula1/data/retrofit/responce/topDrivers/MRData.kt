package ru.jelezov.formula1.data.retrofit.responce.topDrivers

data class MRData(
    val StandingsTable: StandingsTable,
    val limit: String,
    val offset: String,
    val series: String,
    val total: String,
    val url: String,
    val xmlns: String
)
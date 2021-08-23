package ru.jelezov.formula1.model

import ru.jelezov.formula1.data.retrofit.responce.topDrivers.Constructor


data class TopDriversModel (
    val Constructors: List<Constructor>,
    val driver_name: String,
    val driver_family: String,
    val nationality: String,
    val points: String,
    val position: String,
)
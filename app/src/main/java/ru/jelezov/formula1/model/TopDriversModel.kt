package ru.jelezov.formula1.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import ru.jelezov.formula1.data.remote.retrofit.responce.topDrivers.Constructor
import ru.jelezov.formula1.utils.ListConverter

@Entity(tableName = "topDrivers_table")
data class TopDriversModel (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @TypeConverters(ListConverter::class)
    val Constructors: List<Constructor>,
    val driver_name: String,
    val driver_family: String,
    val nationality: String,
    val points: String,
    val position: String,
)
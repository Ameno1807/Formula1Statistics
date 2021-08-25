package ru.jelezov.formula1.data.locale.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ru.jelezov.formula1.data.locale.room.topDrivers.TopDriversDao
import ru.jelezov.formula1.data.locale.room.topTeam.TopTeamDao
import ru.jelezov.formula1.model.TopDriversModel
import ru.jelezov.formula1.model.TopTeamModel
import ru.jelezov.formula1.utils.ListConverter

@Database(
    entities = [TopTeamModel::class, TopDriversModel::class],
    version = 1,
    exportSchema = false)
@TypeConverters(ListConverter::class)

abstract class RoomDatabase : RoomDatabase() {
    abstract fun topTeamDao(): TopTeamDao
    abstract fun topDriversDao(): TopDriversDao
}
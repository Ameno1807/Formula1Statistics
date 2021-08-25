package ru.jelezov.formula1.data.locale

import kotlinx.coroutines.flow.Flow
import ru.jelezov.formula1.data.locale.room.RoomDatabase
import ru.jelezov.formula1.model.TopDriversModel
import ru.jelezov.formula1.model.TopTeamModel

interface LocalDataSource {
   suspend fun insertTopTeam(topTeamFromNetwork: List<TopTeamModel>)
    fun readAllTopTeam(): Flow<List<TopTeamModel>>
   suspend fun insertTopDrivers(topDriversFromNetwork: List<TopDriversModel>)
    fun readAllTopDrivers(): Flow<List<TopDriversModel>>
    suspend fun deleteAllTopDriversList()
    suspend fun deleteAllTopTeamsList()
    fun db() : RoomDatabase
}
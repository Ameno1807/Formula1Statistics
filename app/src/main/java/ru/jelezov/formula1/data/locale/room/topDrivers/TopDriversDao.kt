package ru.jelezov.formula1.data.locale.room.topDrivers

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import ru.jelezov.formula1.model.TopDriversModel
import ru.jelezov.formula1.model.TopTeamModel

@Dao
interface TopDriversDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTopDrivers(drivers: List<TopDriversModel>)

    @Query("SELECT * FROM topDrivers_table ORDER BY id ASC")
    fun readAllTopDriversList(): Flow<List<TopDriversModel>>

    @Query("DELETE FROM topDrivers_table")
    suspend fun deleteAllTopDriversList()

    @Update
    suspend fun updateTopDrivers(drivers: List<TopDriversModel>)
}
package ru.jelezov.formula1.data.locale.room.topDrivers

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import ru.jelezov.formula1.model.TopDriversModel

@Dao
interface TopDriversDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTopDrivers(drivers: List<TopDriversModel>)

    @Query("SELECT * FROM topDrivers_table ORDER BY id ASC")
    fun readAllTopDriversList(): Flow<List<TopDriversModel>>

    @Query("DELETE FROM topDrivers_table")
    suspend fun deleteAllTopDriversList()
}
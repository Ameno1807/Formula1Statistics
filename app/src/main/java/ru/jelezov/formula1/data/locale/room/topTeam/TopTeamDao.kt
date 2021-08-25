package ru.jelezov.formula1.data.locale.room.topTeam

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import ru.jelezov.formula1.model.TopTeamModel

@Dao
interface TopTeamDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTopTeam(teams: List<TopTeamModel>)

    @Query("SELECT * FROM topTeam_table ORDER BY id ASC")
    fun readAllTopTeamList(): Flow<List<TopTeamModel>>

    @Query("DELETE FROM topTeam_table")
    suspend fun deleteAllTopTeamsList()
}
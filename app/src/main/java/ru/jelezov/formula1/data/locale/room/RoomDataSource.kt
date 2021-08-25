package ru.jelezov.formula1.data.locale.room

import kotlinx.coroutines.flow.Flow
import ru.jelezov.formula1.data.locale.LocalDataSource
import ru.jelezov.formula1.model.TopDriversModel
import ru.jelezov.formula1.model.TopTeamModel
import javax.inject.Inject

class RoomDataSource @Inject constructor(
    private val db: RoomDatabase,
    ): LocalDataSource {

    override suspend fun insertTopTeam(topTeamFromNetwork: List<TopTeamModel>) {
        val topTeam = topTeamFromNetwork.map { team ->
            TopTeamModel(
                name = team.name,
                position = team.position,
                points = team.points,
                id = team.id
            )
        }
        db.topTeamDao().insertTopTeam(topTeam)
    }

    override fun readAllTopTeam(): Flow<List<TopTeamModel>> {
        return db.topTeamDao().readAllTopTeamList()
    }

    override suspend fun insertTopDrivers(topDriversFromNetwork: List<TopDriversModel>) {
        val topDrivers = topDriversFromNetwork.map { driver ->
            TopDriversModel(
                driver_name = driver.driver_name,
                nationality = driver.nationality,
                points = driver.points,
                position = driver.position,
                Constructors = driver.Constructors,
                driver_family = driver.driver_family,
                id = 0
            )
        }
        db.topDriversDao().insertTopDrivers(topDrivers)
    }

    override fun readAllTopDrivers(): Flow<List<TopDriversModel>> {
        return db.topDriversDao().readAllTopDriversList()
    }

    override suspend fun deleteAllTopDriversList() {
        db.topDriversDao().deleteAllTopDriversList()
    }

    override suspend fun deleteAllTopTeamsList() {
        db.topTeamDao().deleteAllTopTeamsList()
    }

    override fun db(): RoomDatabase {
        return db
    }
}
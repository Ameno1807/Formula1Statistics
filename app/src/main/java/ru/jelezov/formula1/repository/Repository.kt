package ru.jelezov.formula1.repository

import androidx.room.withTransaction
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import ru.jelezov.formula1.data.locale.room.RoomDataSource
import ru.jelezov.formula1.data.remote.retrofit.RetrofitDataSource
import ru.jelezov.formula1.model.TopDriversModel
import ru.jelezov.formula1.model.TopTeamModel
import ru.jelezov.formula1.utils.Resource
import ru.jelezov.formula1.utils.networkBoundResource
import javax.inject.Inject

class Repository @Inject constructor(
    private val remoteDataSource: RetrofitDataSource,
    private val db: RoomDataSource
) {
    fun loadTopTeam(): Flow<Resource<List<TopTeamModel>>> = networkBoundResource(
        query = {
            db.readAllTopTeam()
        },
        fetch = {
            delay(500)
            remoteDataSource.loadTopTeam()
        },
        saveFetchResult = { team ->
            db.db().withTransaction {
                db.deleteAllTopTeamsList()
                db.insertTopTeam(team)
            }

        }
    )


    fun loadTopDrivers() : Flow<Resource<List<TopDriversModel>>> = networkBoundResource(
        query = {
            db.readAllTopDrivers()
        },
        fetch = {
            delay(500)
            remoteDataSource.loadTopDrivers()
        },
        saveFetchResult = { drivers ->
            db.db().withTransaction {
                db.deleteAllTopDriversList()
                db.insertTopDrivers(drivers)
            }
        }
    )

}

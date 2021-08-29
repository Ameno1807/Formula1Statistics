package ru.jelezov.formula1.repository

import ru.jelezov.formula1.data.locale.room.RoomDataSource
import ru.jelezov.formula1.data.remote.retrofit.RetrofitDataSource
import ru.jelezov.formula1.utils.networkBoundResource
import javax.inject.Inject

class Repository @Inject constructor(
    private val remoteDataSource: RetrofitDataSource,
    private val db: RoomDataSource
) {
    fun loadTopTeam() = networkBoundResource(
        loadFromDb = {
            db.readAllTopTeam()
        },
        fetchData = {
          remoteDataSource.loadTopTeam()
        },
        saveFetchResult = { team ->
            db.insertTopTeam(team)
            db.updateTopTeam(team)
        },
        shouldFetch = { team ->
            team.isEmpty()
        }
    )

    fun loadTopDrivers() = networkBoundResource(
        loadFromDb = {
            db.readAllTopDrivers()
        },
        fetchData = {
            remoteDataSource.loadTopDrivers()
        },
        saveFetchResult = { drivers ->
            db.insertTopDrivers(drivers)
            db.updateTopDrivers(drivers)
        },
        shouldFetch = { drivers ->
            drivers.isEmpty()
        }
    )

}

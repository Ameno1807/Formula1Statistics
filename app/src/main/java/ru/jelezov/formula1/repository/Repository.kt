package ru.jelezov.formula1.repository

import ru.jelezov.formula1.data.retrofit.RetrofitDataSource
import ru.jelezov.formula1.model.TopDriversModel
import ru.jelezov.formula1.model.TopTeamModel
import javax.inject.Inject

class Repository @Inject constructor(
    private val remoteDataSource: RetrofitDataSource
) {
    suspend fun loadTopTeam() : List<TopTeamModel> {
        return remoteDataSource.loadTopTeam().results.map { teamsResponse ->
            TopTeamModel(
                name = teamsResponse.team_name,
                position = teamsResponse.position,
                points = teamsResponse.points,
            )
        }
    }

    suspend fun loadTopDrivers() : List<TopDriversModel> {
        return remoteDataSource.loadTopDrivers().results.map { driversResponse ->
            TopDriversModel(
                driver_name = driversResponse.driver_name,
                nationality = driversResponse.nationality,
                position = driversResponse.position,
                points = driversResponse.points,
                team_name = driversResponse.team_name
            )
        }
    }
}

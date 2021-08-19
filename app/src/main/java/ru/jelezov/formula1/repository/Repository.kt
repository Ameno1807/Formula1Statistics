package ru.jelezov.formula1.repository

import ru.jelezov.formula1.data.retrofit.RetrofitDataSource
import ru.jelezov.formula1.model.TopTeamModel
import javax.inject.Inject

class Repository @Inject constructor(
    private val remoteDataSource: RetrofitDataSource
) {
    suspend fun loadTopTeam() : List<TopTeamModel> {
        return remoteDataSource.loadTopTeam().results.map { teamResponse ->
            TopTeamModel(
                name = teamResponse.team_name,
                position = teamResponse.position,
                points = teamResponse.points,
            )
        }
    }
}
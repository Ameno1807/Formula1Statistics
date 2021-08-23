package ru.jelezov.formula1.repository

import ru.jelezov.formula1.data.retrofit.RetrofitDataSource
import ru.jelezov.formula1.model.TopDriversModel
import ru.jelezov.formula1.model.TopTeamModel
import javax.inject.Inject

class Repository @Inject constructor(
    private val remoteDataSource: RetrofitDataSource
) {
    suspend fun loadTopTeam() : List<TopTeamModel> {
        val teams = remoteDataSource.loadTopTeam().MRData.StandingsTable.StandingsLists.map { teamsResponse ->
            teamsResponse.ConstructorStandings.map { teams ->
                TopTeamModel(
                    name = teams.Constructor.name,
                    position = teams.position,
                    points = teams.points,
                )
            }
        }
        return teams.flatten()
    }

    suspend fun loadTopDrivers() : List<TopDriversModel> {
        val drivers = remoteDataSource.loadTopDrivers().MRData.StandingsTable.StandingsLists.map { driversResponse ->
           driversResponse.DriverStandings.map { team ->
               TopDriversModel(
                   driver_name = team.Driver.givenName,
                   nationality = team.Driver.nationality,
                   points = team.points,
                   position = team.position,
                   Constructors = team.Constructors,
                   driver_family = team.Driver.familyName
               )
           }
        }
        return drivers.flatten()
    }
}

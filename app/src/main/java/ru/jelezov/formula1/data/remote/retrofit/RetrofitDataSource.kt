package ru.jelezov.formula1.data.remote.retrofit

import ru.jelezov.formula1.data.remote.RemoteDataSource
import ru.jelezov.formula1.model.TopDriversModel
import ru.jelezov.formula1.model.TopTeamModel
import javax.inject.Inject

class RetrofitDataSource @Inject constructor(private val service: ApiService) : RemoteDataSource {

    override suspend fun loadTopTeam() : List<TopTeamModel> {
        val teams = service.loadTopTeam().MRData.StandingsTable.StandingsLists.map { teamsResponse ->
            teamsResponse.ConstructorStandings.map { teams ->
                TopTeamModel(
                    name = teams.Constructor.name,
                    position = teams.position,
                    points = teams.points,
                    id = 0
                )
            }
        }
        return teams.flatten()
    }

    override suspend fun loadTopDrivers() : List<TopDriversModel> {
        val drivers = service.loadTopDrivers().MRData.StandingsTable.StandingsLists.map { driversResponse ->
            driversResponse.DriverStandings.map { team ->
                TopDriversModel(
                    driver_name = team.Driver.givenName,
                    nationality = team.Driver.nationality,
                    points = team.points,
                    position = team.position,
                    Constructors = team.Constructors,
                    driver_family = team.Driver.familyName,
                    id = 0
                )
            }
        }
        return drivers.flatten()
    }

}
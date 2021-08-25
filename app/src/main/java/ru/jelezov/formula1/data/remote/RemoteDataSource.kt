package ru.jelezov.formula1.data.remote

import ru.jelezov.formula1.model.TopDriversModel
import ru.jelezov.formula1.model.TopTeamModel


interface RemoteDataSource {
    suspend fun loadTopTeam(): List<TopTeamModel>
    suspend fun loadTopDrivers(): List<TopDriversModel>
}
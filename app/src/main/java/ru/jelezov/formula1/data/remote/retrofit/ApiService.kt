package ru.jelezov.formula1.data.remote.retrofit

import retrofit2.http.GET
import ru.jelezov.formula1.data.remote.retrofit.responce.topDrivers.QuoteResponseTopDrivers
import ru.jelezov.formula1.data.remote.retrofit.responce.topTeam.QuoteResponseTopTeam

interface ApiService {

    @GET("/api/f1/2021/constructorStandings.json")
    suspend fun loadTopTeam(): QuoteResponseTopTeam

    @GET("/api/f1/current/driverStandings.json")
    suspend fun loadTopDrivers(): QuoteResponseTopDrivers
}
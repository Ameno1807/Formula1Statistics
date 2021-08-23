package ru.jelezov.formula1.data.retrofit

import retrofit2.http.GET
import ru.jelezov.formula1.data.retrofit.responce.topDrivers.QuoteResponseTopDrivers
import ru.jelezov.formula1.data.retrofit.responce.topTeam.QuoteResponseTopTeam

interface ApiService {
   /* @Headers(
        "x-rapidapi-host: f1-live-motorsport-data.p.rapidapi.com",
        "x-rapidapi-key: 8613caacc5msh78c5897758f6539p161b2cjsncae9c21938a7"
    )*/
    @GET("/api/f1/2021/constructorStandings.json")
    suspend fun loadTopTeam(): QuoteResponseTopTeam

    @GET("/api/f1/current/driverStandings.json")
    suspend fun loadTopDrivers(): QuoteResponseTopDrivers
}
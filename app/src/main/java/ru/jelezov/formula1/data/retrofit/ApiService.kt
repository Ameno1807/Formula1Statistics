package ru.jelezov.formula1.data.retrofit

import retrofit2.http.GET
import retrofit2.http.Headers
import ru.jelezov.formula1.data.retrofit.responce.QuoteResponseTopDrivers
import ru.jelezov.formula1.data.retrofit.responce.QuoteResponseTopTeam

interface ApiService {
    @Headers(
        "x-rapidapi-host: f1-live-motorsport-data.p.rapidapi.com",
        "x-rapidapi-key: 8613caacc5msh78c5897758f6539p161b2cjsncae9c21938a7"
    )
    @GET("/constructors/standings/2021")
    suspend fun loadTopTeam(): QuoteResponseTopTeam

    @GET("/constructors/drivers/2021")
    suspend fun loadTopDrivers(): QuoteResponseTopDrivers
}
package ru.jelezov.formula1.data

import ru.jelezov.formula1.data.retrofit.responce.QuoteResponseTopDrivers
import ru.jelezov.formula1.data.retrofit.responce.QuoteResponseTopTeam


interface RemoteDataSource {
    suspend fun loadTopTeam(): QuoteResponseTopTeam
    suspend fun loadTopDrivers(): QuoteResponseTopDrivers
}
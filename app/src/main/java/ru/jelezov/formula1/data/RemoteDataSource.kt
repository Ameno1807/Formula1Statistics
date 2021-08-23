package ru.jelezov.formula1.data

import ru.jelezov.formula1.data.retrofit.responce.topDrivers.QuoteResponseTopDrivers
import ru.jelezov.formula1.data.retrofit.responce.topTeam.QuoteResponseTopTeam


interface RemoteDataSource {
    suspend fun loadTopTeam(): QuoteResponseTopTeam
    suspend fun loadTopDrivers(): QuoteResponseTopDrivers
}
package ru.jelezov.formula1.data.retrofit

import ru.jelezov.formula1.data.RemoteDataSource
import ru.jelezov.formula1.data.retrofit.responce.topDrivers.QuoteResponseTopDrivers
import ru.jelezov.formula1.data.retrofit.responce.topTeam.QuoteResponseTopTeam
import javax.inject.Inject

class RetrofitDataSource @Inject constructor(private val service: ApiService) : RemoteDataSource {
    override suspend fun loadTopTeam() : QuoteResponseTopTeam {
        return service.loadTopTeam()
    }

    override suspend fun loadTopDrivers() : QuoteResponseTopDrivers {
        return service.loadTopDrivers()
    }

}
package ru.jelezov.formula1.utils

import android.util.Log
import kotlinx.coroutines.flow.*

inline fun <ResultType, RequestType> networkBoundResource(
    crossinline loadFromDb: () -> Flow<ResultType>,
    crossinline shouldFetch: (ResultType) -> Boolean = { true },
    crossinline fetchData: suspend (ResultType) -> RequestType,
    crossinline saveFetchResult: suspend (RequestType) -> Unit
) = flow {
    val data = loadFromDb().first()

    val flow = if (shouldFetch(data)) {
        emit(Resource.Loading(data))
        try {
            saveFetchResult(fetchData(data))
            loadFromDb().map { Resource.Success(it) }
        } catch (exception: Throwable) {
            loadFromDb().map { Resource.Error(exception, it) }
        }
    } else {
        loadFromDb().map { Resource.Success(it) }
    }

    emitAll(flow)
}
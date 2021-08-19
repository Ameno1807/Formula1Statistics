package ru.jelezov.formula1.data.retrofit

import okhttp3.Interceptor

object ApiKeyInterceptor: Interceptor {

    override fun intercept(chain: Interceptor.Chain): okhttp3.Response {
        val origin = chain.request()
        val urlBuilder = origin.url.newBuilder()
        val url = urlBuilder
            .build()

        val requestBuilder = origin.newBuilder()
            .url(url)

        val request = requestBuilder.build()
        return chain.proceed(request)
    }
}
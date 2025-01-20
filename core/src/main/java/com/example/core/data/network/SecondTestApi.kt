package com.example.core.data.network

import retrofit2.http.GET

interface SecondTestApi {
    @GET("")
    suspend fun getTest()
}
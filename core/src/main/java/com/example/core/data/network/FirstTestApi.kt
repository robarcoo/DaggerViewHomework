package com.example.core.data.network

import retrofit2.http.GET

interface FirstTestApi {
    @GET("")
    suspend fun getTest()
}
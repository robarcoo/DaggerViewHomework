package com.example.core.domain

import retrofit2.Retrofit

interface IRetrofitProvider {

    fun getFirstServer(): Retrofit

    fun getSecondServer(): Retrofit
}
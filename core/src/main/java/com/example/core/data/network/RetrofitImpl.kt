package com.example.core.data.network

import com.example.core.domain.IRetrofitProvider
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import jakarta.inject.Named
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject


class RetrofitImpl @Inject constructor() : IRetrofitProvider {


    override fun getFirstServer(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .baseUrl("http://10.10.0.2:8080")
            .client(provideOkhttp())
            .build()
    }


    override fun getSecondServer(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .baseUrl("http://127.0.0.1:8080")
            .client(provideOkhttp())
            .build()
    }

    private fun provideOkhttp(): OkHttpClient {
        return OkHttpClient()
            .newBuilder()
            .build()
    }

}
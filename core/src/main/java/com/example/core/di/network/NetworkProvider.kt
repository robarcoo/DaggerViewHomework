package com.example.core.di.network

import com.example.core.domain.IRetrofitProvider
import javax.inject.Named

interface NetworkProvider {

    fun provideRetrofit(): IRetrofitProvider

}
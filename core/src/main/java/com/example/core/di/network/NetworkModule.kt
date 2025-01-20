package com.example.core.di.network

import com.example.core.data.network.RetrofitImpl
import com.example.core.domain.IRetrofitProvider
import dagger.Binds
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Named

@Module
class NetworkModule {

    @Provides
    fun provideRetrofit(retrofit: RetrofitImpl): IRetrofitProvider {
        return retrofit
    }

    @Provides
    @Named("first")
    fun provideFirstRetrofit(retrofitImpl: RetrofitImpl): Retrofit {
        return retrofitImpl.getFirstServer()
    }

    @Provides
    @Named("second")
    fun provideSecondRetrofit(retrofitImpl: RetrofitImpl): Retrofit {
        return retrofitImpl.getSecondServer()
    }
}
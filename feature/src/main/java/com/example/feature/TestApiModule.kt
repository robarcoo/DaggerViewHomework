package com.example.feature

import com.example.core.data.network.FirstTestApi
import com.example.core.data.network.RetrofitImpl
import com.example.core.data.network.SecondTestApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Inject
import javax.inject.Singleton

@Module
class TestApiModule {

    @Provides
    fun getTestFirstServer(@Named("first") retrofit: Retrofit) : FirstTestApi {
        return retrofit.create(FirstTestApi::class.java)
    }

    @Provides
    fun getTestSecondServer(@Named("second") retrofit: Retrofit) : SecondTestApi {
        return retrofit.create(SecondTestApi::class.java)
    }
}
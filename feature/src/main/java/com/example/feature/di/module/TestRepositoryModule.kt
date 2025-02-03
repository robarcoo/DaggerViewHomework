package com.example.feature.di.module

import com.example.feature.repository.TestRepository
import com.example.feature.repository.TestRepositoryImpl
import dagger.Binds
import dagger.Module


@Module
interface TestRepositoryModule {

    @Binds
    fun testRepositoryBinding(repository : TestRepositoryImpl) : TestRepository
}
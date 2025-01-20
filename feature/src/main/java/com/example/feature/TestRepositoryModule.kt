package com.example.feature

import dagger.Binds
import dagger.Module


@Module
interface TestRepositoryModule {

    @Binds
    fun testRepositoryBinding(repository : TestRepositoryImpl) : TestRepository
}
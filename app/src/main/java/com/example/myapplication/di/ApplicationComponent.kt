package com.example.myapplication.di

import com.example.core.di.AndroidDependenciesProvider
import com.example.core.di.ApplicationProvider
import com.example.core.di.android.AndroidDependenciesComponent
import com.example.core.di.network.NetworkComponent
import com.example.core.di.network.NetworkProvider
import com.example.myapplication.TestApp
import dagger.Component

interface ApplicationComponent : ApplicationProvider {

    companion object {

        fun init(app: TestApp) : ApplicationProvider {

            val androidDependenciesProvider = AndroidDependenciesComponent.create(app)
            val networkProvider = NetworkComponent.create()

            return DaggerApplicationComponent.factory()
                .create(
                    androidDependenciesProvider,
                    networkProvider
                )
        }
    }

    @Component.Factory
    interface Factory {
        fun create(
            androidDependenciesProvider: AndroidDependenciesProvider,
            networkProvider: NetworkProvider
        ): ApplicationComponent
    }

}
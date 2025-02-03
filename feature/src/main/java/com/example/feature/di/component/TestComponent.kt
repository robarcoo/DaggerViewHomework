package com.example.feature.di.component

import com.example.core.di.ApplicationProvider
import com.example.core.di.network.NetworkModule
import com.example.feature.DaggerTestComponent
import com.example.feature.di.module.TestApiModule
import com.example.feature.di.module.TestRepositoryModule
import com.example.feature.di.module.TestViewModelModule
import com.example.feature.view.TestFragment
import dagger.Component

@Component(dependencies = [ApplicationProvider::class],
    modules = [
        NetworkModule::class,
        TestApiModule::class,
        TestRepositoryModule::class,
        TestViewModelModule::class]
)
interface TestComponent {

    companion object {
        fun initAndGet(applicationProvider: ApplicationProvider) : TestComponent {
            return DaggerTestComponent.factory().create(applicationProvider)

        }
    }

    @Component.Factory
    interface Factory {
        fun create(applicationProvider: ApplicationProvider): TestComponent
    }

    fun inject(fragment : TestFragment)
}
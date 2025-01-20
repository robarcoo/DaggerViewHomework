package com.example.feature

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet


@Module
interface TestViewModelModule {

    @Binds
    @IntoSet
    fun testViewModelBinding(viewModel: TestViewModel) : ViewModel
}
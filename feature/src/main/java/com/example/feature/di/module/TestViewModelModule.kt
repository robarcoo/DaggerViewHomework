package com.example.feature.di.module

import androidx.lifecycle.ViewModel
import com.example.feature.view.TestViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet


@Module
interface TestViewModelModule {

    @Binds
    @IntoSet
    fun testViewModelBinding(viewModel: TestViewModel) : ViewModel
}
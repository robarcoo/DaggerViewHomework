package com.example.feature.di.component

import com.example.core.di.ApplicationProvider
import com.example.core.di.ComponentHolder

object TestComponentHolder : ComponentHolder<TestComponent> {
    private var instance : TestComponent? = null

    override fun init(applicationProvider : ApplicationProvider) : TestComponent {
        if (instance == null) {
            instance = TestComponent.initAndGet(applicationProvider = applicationProvider)
        }
        return instance!!
    }


    override fun reset() {
        instance = null
    }
}
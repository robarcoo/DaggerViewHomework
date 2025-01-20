package com.example.core.di

interface ComponentHolder<T> {
    fun init(applicationProvider: ApplicationProvider) : T
    fun reset()
}
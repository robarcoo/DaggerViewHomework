package com.example.feature.repository

import kotlinx.coroutines.flow.Flow

interface TestRepository {
    fun getTestFirstServer() : Flow<Unit>
    fun getTestSecondServer() : Flow<Unit>
}
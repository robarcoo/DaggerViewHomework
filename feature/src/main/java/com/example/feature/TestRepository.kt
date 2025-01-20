package com.example.feature

import com.example.core.data.network.RetrofitImpl
import kotlinx.coroutines.flow.Flow

interface TestRepository {
    fun getTestFirstServer() : Flow<Unit>
    fun getTestSecondServer() : Flow<Unit>
}
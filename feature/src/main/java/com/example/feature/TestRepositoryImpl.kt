package com.example.feature

import com.example.core.data.network.FirstTestApi
import com.example.core.data.network.SecondTestApi
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class TestRepositoryImpl @Inject constructor(
    private val firstTestApi: FirstTestApi,
    private val secondTestApi: SecondTestApi
) : TestRepository {

    override fun getTestFirstServer() = flow<Unit> {
        firstTestApi.getTest()
    }

    override fun getTestSecondServer() = flow<Unit> {
        secondTestApi.getTest()
    }
}
package com.example.feature

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import javax.inject.Inject

class TestViewModel @Inject constructor(private val repository: TestRepository): ViewModel() {

    fun getFirstServer() {
        viewModelScope.launch {
            repository.getTestFirstServer().first()
        }
    }

    fun getSecondServer() {
        viewModelScope.launch {
            repository.getTestSecondServer().first()
        }
    }
}
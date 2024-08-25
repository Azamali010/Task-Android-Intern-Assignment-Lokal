package com.example.lokaltask.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lokaltask.job_model.jobData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class JobViewModel :ViewModel() {

//    private val repository = Repository()

//    var state by mutableStateOf(ScreenState())

//    init {
//        viewModelScope.launch {
//            val response = repository.getJobList(state.page)
//            state = state.copy(
//                movies = response.body()!!.data
//            )
//        }
//    }

    private val _jobs = MutableStateFlow<jobData?>(null)
    val jobs: StateFlow<jobData?> = _jobs

    init {
        fetchJobs(1) // Fetch jobs for page 1 initially
    }

    private fun fetchJobs(page: Int) {
        viewModelScope.launch {
            try {
//                val response = RetrofitInstance.api.getJobs(page)
//
//                _jobs.value = response
            } catch (e: Exception) {
                // Handle the error
            }
        }
    }

}

//data class ScreenState(
//    val movies :List<jobData> = emptyList(),
//    val page :Int = 1
//)
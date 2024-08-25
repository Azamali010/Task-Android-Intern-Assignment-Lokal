package com.example.lokaltask.network

import com.example.lokaltask.job_model.jobData
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
//    @GET("/posts")
//    suspend fun getJobItem(): Response<List<jobData>>

    @GET("common/jobs")
    suspend fun getJobs(
        @Query("page") page: Int
    ): jobData // Replace with your actual data class

}
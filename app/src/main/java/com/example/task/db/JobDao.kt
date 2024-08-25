package com.example.task.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.lokaltask.job_model.jobData

@Dao
interface JobDao {
    @Insert
    suspend fun addJobs(jobData: jobData)

    @Query("SELECT * FROM Job_table")
    suspend fun getJob():List<jobData>
}
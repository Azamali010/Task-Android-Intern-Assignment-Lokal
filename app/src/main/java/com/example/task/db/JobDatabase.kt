package com.example.task.db

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class JobDatabase :RoomDatabase() {

    abstract fun jobDao() : JobDao
    companion object{
        @Volatile
        private var INSTANCE :JobDatabase? = null

        fun getDataBase(context:Context):JobDatabase{
            if (INSTANCE==null){
                synchronized(this){
                    INSTANCE = Room.databaseBuilder(context,
                        JobDatabase::class.java,
                        "JobData")
                        .build()
                }
            }
            return INSTANCE!!
        }
    }
}
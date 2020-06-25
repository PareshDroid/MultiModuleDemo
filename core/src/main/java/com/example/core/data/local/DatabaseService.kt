package com.example.core.data.local

import android.content.Context
import com.mindorks.bootcamp.learndagger.di.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.DatabaseInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatabaseService @Inject constructor(private val context: Context,
                                          @DatabaseInfo private val databaseName:String,
                                          @DatabaseInfo private val version:Int){

    val dummyData: String
        get() = "DATABASE_DUMMY_DATA"

}
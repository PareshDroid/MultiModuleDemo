package com.example.multimoduledemo.ui

import com.example.core.data.local.DatabaseService
import com.example.core.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.di.ActivityScope
import javax.inject.Inject

@ActivityScope
class MainViewModel @Inject constructor(private val databaseService: DatabaseService, private val networkService: NetworkService) {

    fun getSomeData():String = "${databaseService.dummyData} ${networkService.dummyData}"
}
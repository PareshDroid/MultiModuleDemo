package com.example.core.data

import android.content.Context
import com.mindorks.bootcamp.learndagger.di.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkHelper @Inject constructor(context: Context) {

    val isNetworkConnected: Boolean
        get() = false
}
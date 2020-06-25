package com.example.core.di

import com.example.core.di.module.UtilsModule

import android.content.Context
import com.example.core.data.NetworkHelper
import com.example.core.data.local.DatabaseService
import com.example.core.data.remote.NetworkService
import com.example.core.di.module.ContextModule
import com.mindorks.bootcamp.learndagger.di.ApplicationContext
import dagger.Component
import javax.inject.Singleton

/**
 * Core component that all module's components depend on.
 *
 * @see Component
 */
@Singleton
@Component(modules = [ContextModule::class,UtilsModule::class])
interface CoreComponent {

    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getDatabaseService(): DatabaseService

    fun getNetworkHelper(): NetworkHelper

}

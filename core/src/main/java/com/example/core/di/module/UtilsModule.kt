package com.example.core.di.module

import com.mindorks.bootcamp.learndagger.di.DatabaseInfo
import com.mindorks.bootcamp.learndagger.di.NetworkInfo
import dagger.Module
import dagger.Provides

@Module
class UtilsModule {



    @Provides
    @DatabaseInfo
    fun provideDatabaseName():String = "dummy_db"


    @Provides
    @DatabaseInfo
    fun provideDatabaseVersion():Int = 1


    @Provides
    @NetworkInfo
    fun provideApiKey():String = "SOME_API_KEY"

}
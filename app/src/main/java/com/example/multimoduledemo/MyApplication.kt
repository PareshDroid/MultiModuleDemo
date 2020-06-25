package com.example.multimoduledemo


import android.app.Application
import android.content.Context
import com.example.core.di.CoreComponent
import com.example.core.di.DaggerCoreComponent
import com.example.core.di.module.ContextModule
import com.example.multimoduledemo.di.DaggerAppComponent
import javax.inject.Inject

class MyApplication() : Application() {

    lateinit var coreComponent: CoreComponent


    companion object {

        /**
         * Obtain core dagger component.
         *
         * @param context The application context
         */
        @JvmStatic
        fun coreComponent(context: Context) =
            (context.applicationContext as? MyApplication)?.coreComponent
    }

    override fun onCreate() {
        super.onCreate()
        getCoreDependencies()
        getAppDependency()
    }

    private fun getAppDependency() {
        DaggerAppComponent
            .builder()
            .coreComponent(coreComponent)
            .build()
            .inject(this)
    }

    fun getCoreDependencies(){

        coreComponent = DaggerCoreComponent
            .builder()
            .contextModule(ContextModule(this))
            .build()

    }
}
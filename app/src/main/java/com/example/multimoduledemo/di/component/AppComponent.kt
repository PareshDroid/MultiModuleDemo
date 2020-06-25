package com.example.multimoduledemo.di.component

import com.example.core.di.CoreComponent
import com.example.core.di.scope.AppScope
import com.example.multimoduledemo.MyApplication
import com.example.multimoduledemo.di.module.AppModule
import dagger.Component

@AppScope
@Component(
    dependencies = [CoreComponent::class],
    modules = [AppModule::class]
)
interface AppComponent {

    /**
     * Inject dependencies on application.
     *
     * @param application The sample application.
     */
    fun inject(application: MyApplication)
}
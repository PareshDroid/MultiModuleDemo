package com.example.multimoduledemo.di

import com.example.core.di.CoreComponent
import com.example.core.di.scope.AppScope
import com.example.multimoduledemo.MyApplication
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
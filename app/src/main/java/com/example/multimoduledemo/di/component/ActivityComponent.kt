package com.example.multimoduledemo.di.component

import com.example.core.di.CoreComponent
import com.example.multimoduledemo.di.module.ActivityModule
import com.example.multimoduledemo.ui.MainActivity
import com.mindorks.bootcamp.learndagger.di.ActivityScope
import dagger.Component

@ActivityScope
@Component(dependencies = [CoreComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

}
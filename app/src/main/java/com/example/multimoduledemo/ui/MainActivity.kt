package com.example.multimoduledemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.multimoduledemo.MyApplication
import com.example.multimoduledemo.R
import com.example.multimoduledemo.di.component.DaggerActivityComponent
import com.example.multimoduledemo.di.module.ActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel:MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        getSomeDependencies()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvData = findViewById<TextView>(R.id.tv_message)
        tvData.text = viewModel.getSomeData()

    }

    fun getSomeDependencies(){
        DaggerActivityComponent
            .builder()
            .coreComponent(MyApplication.coreComponent(this))
            .activityModule(ActivityModule(this))
            .build()
            .inject(this);
    }
}
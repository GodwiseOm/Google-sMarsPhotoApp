package com.example.marsphotos

import android.app.Application
import com.example.marsphotos.Data.AppContainer
import com.example.marsphotos.Data.DefaultAppContainer

class MarsPhotoApplication : Application(){

    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
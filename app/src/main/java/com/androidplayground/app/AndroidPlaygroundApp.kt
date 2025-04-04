package com.androidplayground.app

import android.app.Application
import com.androidplayground.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AndroidPlaygroundApp : Application() {
    override fun onCreate() {
        super.onCreate()
        
        startKoin {
            androidContext(this@AndroidPlaygroundApp)
            modules(appModule)
        }
    }
} 
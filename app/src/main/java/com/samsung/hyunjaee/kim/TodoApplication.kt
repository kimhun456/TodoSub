package com.samsung.hyunjaee.kim

import android.app.Application
import timber.log.Timber

class TodoApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}
package com.example.myapplication

import android.app.Application
import android.util.Log
import co.sourse.pvnsdk.Sourse

class ExampleApplication : Application() {

    companion object {
        private val TAG = ExampleApplication::class.simpleName
    }

    override fun onCreate() {
        super.onCreate()
        Log.i(TAG, "Launching the Incoming Push Video Notification SDK")

        val endPoint = getString(R.string.incoming_pvn_endpoint)
        val projectKey = getString(R.string.incoming_pvn_project_key)

        // Turn on logging (optional)
        Sourse.setDevBuild(true)
        Sourse.initialize(applicationContext, endPoint, projectKey)

        Log.i(TAG, "Launched the Incoming Push Video Notification SDK")
    }
}
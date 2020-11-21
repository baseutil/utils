package com.test.myapplication

import android.app.IntentService
import android.app.Service
import android.content.Intent
import android.content.Context
import android.os.IBinder


class MyIntentService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }


}

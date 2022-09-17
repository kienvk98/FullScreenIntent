package com.example.full_screen_intent_notification

import android.content.Intent
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel


class MainActivity : FlutterActivity() {
    private val FULL_SCREEN_INTENT_CHANNEL = "FullScreenIntentChannel"

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, FULL_SCREEN_INTENT_CHANNEL).setMethodCallHandler { call, result ->
            when(call.method){
                "Notify while the app on the foreground" -> {
                    Log.d("kiennt", "Notify while the app on the foreground")
                    showNotificationWithFullScreenIntent()
                }
                "Schedule Full-Screen Intent Notification" -> {
                    Log.d("kiennt", "Schedule Full-Screen Intent Notification")
                    scheduleNotification(false)
                }
                "Full-Screen Intent on Lock Screen with a Keyguard" -> {
                    Log.d("kiennt", "Full-Screen Intent on Lock Screen with a Keyguard")
                    scheduleNotification(true)
                }
            }

            result.success("ActivityStarted")
        }
    }
}

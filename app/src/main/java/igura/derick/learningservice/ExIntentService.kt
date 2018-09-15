package igura.derick.learningservice

import android.app.IntentService
import android.content.Intent
import android.util.Log
import kotlin.concurrent.thread

class ExIntentService : IntentService(ExIntentService::class.java.name) {


    override fun onHandleIntent(intent: Intent?) {
        Log.i("Service", "Intent Service - Start")

        Thread.sleep(2000)

        Log.i("Service", "Intent Service - End")
    }

    override fun onCreate() {
        Log.i("Service", "Intent Service - onCreate")
        super.onCreate()
    }

    override fun onDestroy() {
        Log.i("Service", "Intent Service - onDestroy")
        super.onDestroy()
    }
}
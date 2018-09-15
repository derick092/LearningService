package igura.derick.learningservice

import android.app.Service
import android.content.Intent
import android.os.Handler
import android.os.IBinder
import android.util.Log
import java.util.*



class StartedService : Service() {
    private val runnable = object : Runnable {
        override fun run() {
            val r = Random()
            val random = r.nextInt(10)
            Log.i("services", "random: $random")

            if (random == 3) {
                stopSelf()
            } else {
                handler.postDelayed(this, 1500)
            }
        }
    }

    private val handler = Handler()

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("Service", "Started Service - onStart")
        handler.postDelayed(runnable, 1500);
        return Service.START_NOT_STICKY
    }
    override fun onCreate() {
        super.onCreate()
        Log.i("Service", "Started Service - onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Service", "Started Service - onDestroy")
    }
}
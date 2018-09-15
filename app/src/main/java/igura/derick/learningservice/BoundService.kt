package igura.derick.learningservice

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.util.Log
import java.util.*

class BoundService : Service(){
    override fun onBind(intent: Intent?): IBinder {
        Log.i("Service", "Bounded Service - onBind")
            return thisBinder()
    }

    inner class thisBinder : Binder(){
        fun getService() : BoundService{
            return this@BoundService
        }
    }

    override fun onCreate() {
        Log.i("Service", "Bounded Service - onCreate")
    }

    override fun onDestroy() {
        Log.i("Service", "Bounded Service - onCreate")
    }

    override fun onUnbind(intent: Intent?): Boolean {
        Log.i("Service", "Bounded Service - onUnbind")
            return super.onUnbind(intent)
    }

    fun randomNumber():Int{
        return Random().nextInt(100)
    }
}
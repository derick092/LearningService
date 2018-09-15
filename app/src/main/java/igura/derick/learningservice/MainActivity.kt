package igura.derick.learningservice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.ComponentName
import android.content.Context
import android.os.IBinder
import android.content.ServiceConnection



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*var binder: Any?

        val serviceConnection = object : ServiceConnection {
            override fun onServiceConnected(
                    componentName: ComponentName,
                    iBinder: IBinder) {
                binder = iBinder as BoundService.thisBinder
            }

            override fun onServiceDisconnected(componentName: ComponentName) {
                binder = null
            }
        }

        // intent explicita
        val intent = Intent(this, StartedService::class.java)
        startService(intent)

        val intent2 = Intent(this, BoundService::class.java)
        bindService(intent2, serviceConnection, Context.BIND_AUTO_CREATE)*/

        val intent = Intent(this, ExIntentService::class.java)
        startService(intent)
    }
}

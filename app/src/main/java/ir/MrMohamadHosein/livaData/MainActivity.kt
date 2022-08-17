package ir.MrMohamadHosein.livaData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myLocationListener = MyLocationListener()

        Log.v("testLog" , myLocationListener.getLocationData().value ?: "null")

        myLocationListener.getLocationData().observe(this) {
            Log.v("testLog" , it)
        }

    }

}
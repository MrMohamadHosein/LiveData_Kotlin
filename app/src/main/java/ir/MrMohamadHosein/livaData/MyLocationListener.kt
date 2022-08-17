package ir.MrMohamadHosein.livaData

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.util.*

class MyLocationListener {
    private val locationData = MutableLiveData<String>()

    init {

        val timer = Timer()
        timer.schedule(
            object : TimerTask() {
                override fun run() {
                    locationData.postValue( System.currentTimeMillis().toString() )
                }
            },
            1000L,
            1000L
        )

    }

    fun getLocationData() :LiveData<String> {
        return locationData
    }


}
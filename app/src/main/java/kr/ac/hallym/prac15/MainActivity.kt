package kr.ac.hallym.prac15

import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    lateinit var manager: LocationManager

    fun getMyLocation(){
        val location = manager.getLastKnownLocation(LocationManager.GPS_PROVIDER)

        location?.let {
            val latitude = location.latitude

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = getSystemService(LOCATION_SERVICE) as LocationManager

        var result = "All Providers: "
        val providers = manager.allProviders
        for(provider in providers){
            result += "$provider, "
        }
        Log.d("kkang",result)

        result = "Enabled Providers: "
        val enabledProviders = manager.getProviders(true)
        for(provider in enabledProviders){
            result += "$provider, "
        }
        Log.d("kkang", result)
    }
}
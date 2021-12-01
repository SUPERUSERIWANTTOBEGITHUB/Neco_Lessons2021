package yvg68.measurer.crc5_logging
// lesson 4
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivityLog", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivityLog", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivityLog", "Экскурс из жесткой жизни прозы")

    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivityLog", "ЗonResume")

    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivityLog", "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivityLog", "onDestroy")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivityLog", "onRestart")

    }
}
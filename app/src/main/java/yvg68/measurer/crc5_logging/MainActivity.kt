package yvg68.measurer.crc5_logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivityLog", "Печаль и радость, смех и слёзы,")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivityLog", "Огонь сердец и песня чувства,")

    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivityLog", "Экскурс из жесткой жизни прозы")

    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivityLog", "За облака, в любви искусство,")

    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivityLog", "Исток души и строк нетленность...")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivityLog", "Я восхищаюсь вдохновенно...")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivityLog", "onRestart")

    }
}
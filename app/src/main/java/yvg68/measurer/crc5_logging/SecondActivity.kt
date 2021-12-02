package yvg68.measurer.crc5_logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var textViewSecond = findViewById<TextView>(R.id.textViewSecond)
        textViewSecond.text = "Starting STATE"
        var buttonBack = findViewById<Button>(R.id.buttonBack)
        buttonBack.text = "BACK"
    }
    fun onClickButtonBack(view:View){
        var buttonBack = findViewById<Button>(R.id.buttonBack)
        buttonBack.text = "BACK"
    }
}
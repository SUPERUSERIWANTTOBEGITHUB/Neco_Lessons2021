package yvg68.measurer.crc5_logging
//second activity_
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

private const val HELLO_KEY = "hello"
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        lateinit var buttonBack: Button
        var textViewSecond = findViewById<TextView>(R.id.textViewSecond)
        textViewSecond.text = "Starting STATE SECOND ACTIVITY"
        buttonBack = findViewById<Button>(R.id.buttonBack)
        buttonBack.text = "BACK"
        // // Here starting "Intent "
        buttonBack = findViewById(R.id.buttonBack)
        buttonBack.setOnClickListener {
            var MainActivityIntent = Intent(this, MainActivity::class.java)
            MainActivityIntent.putExtra(HELLO_KEY, "There was a transition from the second activity")
            startActivity(MainActivityIntent)
        }
    }
        
    fun onClickButtonBack(view:View){
        var buttonBack = findViewById<Button>(R.id.buttonBack)
        buttonBack.text = "BACK"
    }
}
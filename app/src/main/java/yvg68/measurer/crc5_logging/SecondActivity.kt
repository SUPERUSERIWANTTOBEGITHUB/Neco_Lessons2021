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
    companion object{
        var TOTAL_COUNT = "0f"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        lateinit var buttonBack: Button
        var textViewSecond = findViewById<TextView>(R.id.textViewSecond)
        textViewSecond.text = "YOU SEE THIS DISPLAY"
        buttonBack = findViewById<Button>(R.id.buttonBack)
        buttonBack.text = "BACK"
        var textViewCount = findViewById<TextView>(R.id.textViewRandom)
        //textViewCount.text = TOTAL_COUNT
        var countReseive = intent.getStringExtra(TOTAL_COUNT)
        textViewCount.text = countReseive
        // // Here starting "Intent "
        buttonBack = findViewById(R.id.buttonBack)
        buttonBack.setOnClickListener {
            var MainActivityIntent = Intent(this, MainActivity::class.java)
            MainActivityIntent.putExtra(HELLO_KEY, "There was a transition from the second activity")
            //var textView = findViewById<TextView>(R.id.textViewMsg)
            //textView.text = "HI from SECOND ACTIVITY"
            startActivity(MainActivityIntent)
        }
    }
        
    fun onClickButtonBack(view:View){
        var buttonBack = findViewById<Button>(R.id.buttonBack)
        buttonBack.text = "BACK"
    }
}
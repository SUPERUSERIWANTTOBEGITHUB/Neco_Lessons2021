package yvg68.measurer.crc5_logging
// lesson 4
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.view.View
// val for Intent
private const val HELLO_KEY = "hello"

public var TOTAL_COUNT: String = "0"
var count:Int  = 0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivityLog", "Печаль и радость, смех и слёзы,")
        // variable for Intent
        lateinit var buttonNext: Button
        var textView = findViewById<TextView>(R.id.textViewMsg)
        textView.text = "THE STARTING STATE FIRST ACTIVITY."
        var buttonRight = findViewById<Button>(R.id.buttonRight)
        buttonRight.text = "PUSH"
        buttonNext = findViewById<Button>(R.id.buttonNext)
        buttonNext.text = "NEXT"
        var buttonLeft = findViewById<Button>(R.id.buttonLeft)
        buttonLeft.text = "DONT PUSH"

        // // Here starting "Intent "
        buttonNext = findViewById(R.id.buttonNext)
        buttonNext.setOnClickListener {
            //var secondActivityIntent = Intent(this, SecondActivity ::class.java)
            //secondActivityIntent.putExtra(HELLO_KEY, "This second activity application")
            //var textViewSecond = findViewById<TextView>(R.id.textViewSecond)
            //textViewSecond.text = "THIS SCREEN OPENED"
            var textCount:String
            //count:Int = 5 //= Integer.parseInt(countString.text.toString())
            count++
            
            textCount = count.toString()
            val countIntent = Intent(this, SecondActivity::class.java)
            countIntent.putExtra(SecondActivity.TOTAL_COUNT, textCount)
            startActivity(countIntent)
            //startActivity(secondActivityIntent)
           }
    fun onClickButtonNext(view: View){
        val textCount: String //= findViewById<TextView>(R.id.textViewRandom)
        val countString = findViewById<TextView>(R.id.textViewRandom)
        count = 2 //= Integer.parseInt(countString.text.toString())
        count++
        textCount = count.toString()
        val countIntent = Intent(this, SecondActivity::class.java)
        countIntent.putExtra(SecondActivity.TOTAL_COUNT, textCount)
        startActivity(countIntent)
    }

    }
    fun onClickButtonRight(view: View){
        var textView = findViewById<TextView>(R.id.textViewMsg)
        var buttonRight = findViewById<Button>(R.id.buttonRight)
        var buttonLeft = findViewById<Button>(R.id.buttonLeft)
        textView.text = "PUSHED RIGHT BUTTON"
        buttonRight.text = "DONT PUSH"
        buttonLeft.text = "PUSH"

    }
    fun onClickButtonLeft(view: View){
        var textView = findViewById<TextView>(R.id.textViewMsg)
        var buttonRight = findViewById<Button>(R.id.buttonRight)
        var buttonLeft = findViewById<Button>(R.id.buttonLeft)
        var buttonLeftBackground = findViewById<Button>(R.id.buttonLeft)
        //buttonLeftBackground.background =
        var buttonRightBackground = findViewById<Button>(R.id.buttonRight)
        //buttonRightBackground.background =
        textView.text = "PUSHED LEFT BUTTON"
        buttonRight.text = "PUSH"
        buttonLeft.text = "DONT PUSH"

    }
    fun onClickButtonNext(view:View){
        
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
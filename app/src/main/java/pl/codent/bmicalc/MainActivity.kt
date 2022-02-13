package pl.codent.bmicalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val et1 = findViewById<EditText>(R.id.editTextNumber)
        val et2 = findViewById<EditText>(R.id.editTextNumber2)
        val textvw = findViewById<TextView>(R.id.textView3)

        button.setOnClickListener {
            val mass = et1.toInt()
            val height = et2.toInt()
            val bmi = Bmi(mass,height)
            textvw.text = bmi.formatString()
        }


    }
    fun EditText.toInt(): Int {
        // extension function
        val valu: Int = try {
            this.text.toString().toInt()
        } catch (nfe: NumberFormatException){
            this.error = getString(R.string.invalid_input)
            0
        }
        return valu
    }
}
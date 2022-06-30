package com.example.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.ConsoleMessage
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var name: EditText? = null
    var height: EditText? = null
    var weight: EditText? = null
    var age: EditText? = null
    var button: Button? = null
    var error: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.editTextName)
        height = findViewById(R.id.editTextHeight)
        weight = findViewById(R.id.editTextWeight)
        age = findViewById(R.id.editTextAge)
        button = findViewById(R.id.buttonCalculate)
        error = findViewById(R.id.textError)

        button?.setOnClickListener{checkValues()}
    }
    fun checkValues(){
        error?.setVisibility(TextView.INVISIBLE)
        if (name?.text.toString().isEmpty() || height?.text.toString().isEmpty() || weight?.text.toString().isEmpty() || age?.text.toString().isEmpty()) {
            error?.setVisibility(TextView.VISIBLE)
            error?.setText("the data is incorrect")
        }
        else {
            var newHeight = height?.text.toString().toInt()
            var newWeight = weight?.text.toString().toDouble()
            var newAge = age?.text.toString().toInt()
            if (newHeight > 0 && newHeight < 250 && newAge > 0 && newAge < 150 && newWeight > 0 && newWeight < 250) {
                error?.setVisibility(TextView.VISIBLE)
                var value: String = "Date For " + name?.text.toString() + " is " + newHeight * newAge * newWeight
                error?.setText("Ответ $value")}
            else {
                error?.setVisibility(TextView.VISIBLE)
                error?.setText("the data is incorrect")
            }
        }
    }
}
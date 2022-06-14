package com.example.calculatrice_simple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var results: Int = 0
    val num1 = findViewById<EditText>(R.id.num1)
    val num2 = findViewById<EditText>(R.id.num2)

    fun doSum(view: View) {
        results = num1.editableText.toString().toInt() + num2.editableText.toString().toInt()
        result.text = results.toString()
    }

    fun doSub(view: View) {
        results = num1.editableText.toString().toInt() + num2.editableText.toString().toInt()
        result.text = results.toString()
    }

    fun doMul(view: View) {
        results = num1.editableText.toString().toInt() + num2.editableText.toString().toInt()
        result.text = results.toString()
    }

    fun doDiv(view: View) {
        results = num1.editableText.toString().toInt() + num2.editableText.toString().toInt()
        result.text = results.toString()
    }
}
package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus.setOnClickListener {
            try {
                var a = etNumA.text.toString().toInt()
                var b = etNumB.text.toString().toInt()
//            var sum = a+b
//            tvResult.text = sum.toString()
                tvResult.text = "${a+b}"
            } catch (e: Exception) {
                etNumA.setError("Please enter a valid input")
                etNumB.setError("Please enter a valid input")

            }


        }

        btnMinus.setOnClickListener {
            var a = etNumA.text.toString().toInt()
            var b = etNumB.text.toString().toInt()
//            var sum = a+b
//            tvResult.text = sum.toString()
            tvResult.text = "${a-b}"
        }



    }
}
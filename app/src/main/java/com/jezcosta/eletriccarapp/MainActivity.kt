package com.jezcosta.eletriccarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var price: EditText
    lateinit var kmUsed: EditText
    lateinit var btnCalculate: Button
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
    }

    fun setupView() {
        price = findViewById(R.id.et_price)
        kmUsed = findViewById(R.id.et_km_used)
        btnCalculate = findViewById(R.id.btn_calc)
        result = findViewById(R.id.txt_result)
    }

    fun setupListeners () {
        btnCalculate.setOnClickListener {
            calculate()
        }
    }

    fun calculate () {
        val priceValue = price.text.toString().toFloat()
        val kmUsedValue = kmUsed.text.toString().toFloat()

        val resultado = priceValue / kmUsedValue
        result.text = resultado.toString()
    }
}
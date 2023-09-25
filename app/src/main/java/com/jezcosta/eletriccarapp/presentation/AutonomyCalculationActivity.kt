package com.jezcosta.eletriccarapp.presentation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.jezcosta.eletriccarapp.R

class AutonomyCalculationActivity : AppCompatActivity() {
    lateinit var price: EditText
    lateinit var kmUsed: EditText
    lateinit var btnCalculate: Button
    lateinit var result: TextView
    lateinit var btnClose: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autonomy_calculation)
        setupView()
        setupListeners()
    }

    fun setupView() {
        price = findViewById(R.id.et_price)
        kmUsed = findViewById(R.id.et_km_used)
        btnCalculate = findViewById(R.id.btn_calc)
        result = findViewById(R.id.txt_result)
        btnClose = findViewById(R.id.iv_close)
    }

    fun setupListeners() {
        btnCalculate.setOnClickListener {
            calculate()
        }

        btnClose.setOnClickListener {
            finish()
        }
    }

    fun calculate() {
        val priceValue = price.text.toString().toFloat()
        val kmUsedValue = kmUsed.text.toString().toFloat()

        val resultado = priceValue / kmUsedValue
        result.text = resultado.toString()
    }
}
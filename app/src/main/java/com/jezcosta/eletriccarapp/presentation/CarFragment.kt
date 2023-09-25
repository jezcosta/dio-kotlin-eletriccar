package com.jezcosta.eletriccarapp.presentation

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.jezcosta.eletriccarapp.R
import com.jezcosta.eletriccarapp.data.CarFactory
import com.jezcosta.eletriccarapp.presentation.adapter.CarAdapter

class CarFragment: Fragment() {
    lateinit var fabCalculate: FloatingActionButton
    lateinit var carsList: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.car_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView(view)
        setupList()
        setupListeners()
    }

    fun setupView(view: View) {
        view.apply {
            fabCalculate = findViewById(R.id.fab_calculate)
            carsList = findViewById(R.id.rv_car_list)
        }
    }

    fun setupList() {
        // val data = arrayOf("Cupcake", "Donut", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean")
        // val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        val adapter = CarAdapter(CarFactory.list)
        carsList.adapter = adapter
    }

    fun setupListeners() {
        fabCalculate.setOnClickListener {
            startActivity(Intent(context, AutonomyCalculationActivity::class.java))
        }
    }
}
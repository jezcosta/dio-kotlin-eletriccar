package com.jezcosta.eletriccarapp.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jezcosta.eletriccarapp.R
import com.jezcosta.eletriccarapp.domain.Car

class CarAdapter(private val cars: List<Car>): RecyclerView.Adapter<CarAdapter.ViewHolder>() {

    // create a new view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.car_item, parent, false)
        return ViewHolder(view)
    }

    // get the content from view and change to item list information
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        cars.apply {
            holder.txtPrice.text = this[position].price
            holder.txtBattery.text = this[position].battery
            holder.txtPower.text = this[position].power
            holder.txtRecharge.text = this[position].recharge
        }

    }

    // Get cars list quantity
    override fun getItemCount(): Int = cars.size

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val txtPrice: TextView
        val txtBattery: TextView
        val txtPower: TextView
        val txtRecharge: TextView

        init {
            view.apply {
                txtPrice = findViewById(R.id.txt_price_value)
                txtBattery = findViewById(R.id.txt_battery_value)
                txtPower = findViewById(R.id.txt_power_value)
                txtRecharge = findViewById(R.id.txt_recharge_value)
            }

        }
    }
}


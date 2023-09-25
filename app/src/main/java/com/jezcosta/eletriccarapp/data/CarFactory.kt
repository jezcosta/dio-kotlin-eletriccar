package com.jezcosta.eletriccarapp.data

import com.jezcosta.eletriccarapp.domain.Car

object CarFactory {
    val list = listOf<Car>(
        Car(
            id = 1,
            price = "R$ 300.000,00",
            battery = "300 kWh",
            power = "200cv",
            recharge = "30 min",
            urlPhoto = "www.google.com.br"
        ),
        Car(
            id = 2,
            price = "R$ 320.000,00",
            battery = "320 kWh",
            power = "220cv",
            recharge = "32 min",
            urlPhoto = "www.google.com.br"
        ),
        Car(
            id = 3,
            price = "R$ 330.000,00",
            battery = "330 kWh",
            power = "230cv",
            recharge = "33 min",
            urlPhoto = "www.google.com.br"
        )
    )
}
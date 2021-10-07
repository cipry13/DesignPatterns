package com.ch.designpatterns.creational

object Singleton {
    init {
        println("Singleton initialized")
    }

    var message = "Kotlin rock"

    fun showMessage() {
        println(message)
    }
}

fun main() {
    val obj1 = Singleton
    val obj2 = Singleton

    Singleton.message = "Kotlin is cool"
    Singleton.showMessage()

    Singleton.message = "Kotlin is cooler"
    Singleton.showMessage()
}

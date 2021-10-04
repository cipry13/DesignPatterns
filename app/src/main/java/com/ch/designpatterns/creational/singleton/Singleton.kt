package com.ch.designpatterns.creational.singleton

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

    obj1.message = "Kotlin is cool"
    obj1.showMessage()

    obj2.message = "Kotlin is cooler"
    obj1.showMessage()
}

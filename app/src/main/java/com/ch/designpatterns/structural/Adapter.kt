package com.ch.designpatterns.structural

interface Android {
    fun charge()
}

interface IPhone {
    fun charge()
}

class AndroidCharger : Android {
    override fun charge() {
        println("Android phone is charging")
    }
}

class IPhoneCharger : IPhone {
    override fun charge() {
        println("Iphone is charging")
    }
}

class IPhoneToAndroidAdapter(private val androidPhone: Android) : IPhone {
    override fun charge() {
        androidPhone.charge()
    }
}

fun main() {
    // This will charge android phone
    val androidCharger: Android = AndroidCharger()
    androidCharger.charge()

    // This will charge IPhone
    val iPhoneCharger: IPhone = IPhoneCharger()
    iPhoneCharger.charge()

    // How to charge iphone with android charger?
    val adapter = IPhoneToAndroidAdapter(androidCharger)
    adapter.charge()
}

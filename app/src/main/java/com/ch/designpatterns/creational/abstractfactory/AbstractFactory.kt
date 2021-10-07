package com.ch.designpatterns.creational.abstractfactory

interface EnemyShipFactory {
    fun createZaraShip(): EnemyShip
}

class ZaraEnemyShipFactory: EnemyShipFactory {
    override fun createZaraShip(): EnemyShip {
        return ZaraEnemyShip()
    }

}

class KiraEnemyShipFactory : EnemyShipFactory {
    override fun createZaraShip(): EnemyShip {
        return KiraEnemyShip()
    }
}

interface EnemyShip {
    fun showEnemyShipInfo()
}

class ZaraEnemyShip : EnemyShip {
    override fun showEnemyShipInfo() {
        println("1. Ship name: Zara.\n2. Weapon damage: 20.\n3. Ship speed: 100 km/h")
    }
}

class KiraEnemyShip: EnemyShip {
    override fun showEnemyShipInfo() {
        println("1. Ship name: Kira.\n2. Weapon damage: 70.\n3. Ship speed: 60 km/h")
    }
}

fun main() {
    val zaraEnemyShipFactory = ZaraEnemyShipFactory()
    val kiraEnemyShipFactory = KiraEnemyShipFactory()

    val zaraEnemyShip = zaraEnemyShipFactory.createZaraShip()
    val kiraEnemyShip = kiraEnemyShipFactory.createZaraShip()

    zaraEnemyShip.showEnemyShipInfo()
    println()
    kiraEnemyShip.showEnemyShipInfo()
}
package ru.netology

fun main() {
    val amount = 1_900
    val loyaltyClient = true
    val amountAfterDiscount = amount - calculateInitialDiscount(amount) - calculateLoyalDiscount(amount, loyaltyClient)
    println("Сумма : $amountAfterDiscount руб.")
}
fun calculateInitialDiscount(amount: Int): Int {
    val initialDiscount: Int
    when (amount) {
        in 0..1_000 -> {
            initialDiscount = 0
            println("\tВаша скидка 0 руб.")
        }
        in 1_001..10_000 -> {
            initialDiscount = 100
            println("\tВаша скидка 100 руб.")
        }
        else -> {
            initialDiscount = (amount * 0.05).toInt()
            println("\tВаша скидка 5% = $initialDiscount руб.")
        }
    }
    return initialDiscount
}
fun calculateLoyalDiscount(amount : Int, loyal : Boolean) : Int {
    val discountLoyal: Int
    if (loyal) {
        discountLoyal = (amount * 0.01).toInt()
        println("\tВаша скидка меломана 1% = $discountLoyal руб.")
    } else {
        discountLoyal = 0
    }
    return discountLoyal
}
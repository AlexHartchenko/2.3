package ru.netology

fun main() {
    val amount = 10001
    val loyaltyClient = true
    val initialDiscount = calculateInitialDiscount(amount)
    val loyalDiscount = calculateLoyalDiscount(amount, loyaltyClient)
    val amountAfterDiscount = amount - initialDiscount - loyalDiscount
    println("Сумма : $amountAfterDiscount руб.")
}

fun calculateInitialDiscount(amount: Int): Int {
    return when (amount) {
        in 0..1_000 -> 0
        in 1_001..10_000 -> 100
        else -> (amount * 0.05).toInt()
    }
}

fun calculateLoyalDiscount(amount: Int, loyaltyClient: Boolean): Int {
    return if (loyaltyClient) {
        ((amount - calculateInitialDiscount(amount)) * 0.01).toInt()
    } else {
        0
    }
}

package ru.netology

fun main() {
    val amount = 100_000
    val loyaltyClient = true
    val amountAfterDiscount = amount - calculateInitialDiscount(amount) - calculateLoyalDiscount(amount, loyaltyClient)
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
    val discountLoyal: Int = if (loyaltyClient) {
        ((amount - calculateInitialDiscount(amount)) * 0.01).toInt()
    } else {
        0
    }
    return discountLoyal
}
package ru.netology

fun main() {
    val postClient = true
    val sumOrder = 10001
    val saleMin = 100
    val saleMax = sumOrder * 5 / 100

    val sum = sumOrder - saleMin
    val sum2 = sumOrder - saleMax

    if (!postClient) {

        if (sumOrder <= 1000) {
            println("Сумма покупки: $sumOrder руб.")
        } else if (sumOrder >= 10001) {
            println("Сумма покупки: $sum2 руб., Ваша скидка составила 5%: $saleMax руб.")
        } else if (sumOrder >= 1001) {
            println("Сумма покупки: $sum руб., Ваша скидка составила: $saleMin руб.")
        }

    } else {

        val saleFixSumOrder = sumOrder * 1 / 100
        val saleFixSum = sum * 1 / 100
        val saleFixSum2 = sum2 * 1 / 100

        val clientSumOrder = sumOrder - saleFixSumOrder
        val clientSum = sumOrder - saleMin - saleFixSum
        val clientSum2 = sumOrder - saleMax - saleFixSum2

        if (sumOrder <= 1000) {
            println("Сумма покупки: $clientSumOrder руб., Ваша скидка постоянного клиента составила: $saleFixSumOrder руб.")
        } else if (sumOrder >= 10001) {
            println("Сумма покупки: $clientSum2 руб., скидка на покупку 5%: $saleMax руб., + скидка постоянного клиента: $saleFixSum2 руб.")
        } else if (sumOrder >= 1001) {
            println("Сумма покупки: $clientSum руб., скидка на покупку: $saleMin руб., + скидка постоянного клиента: $saleFixSum руб.")
        }
    }
}
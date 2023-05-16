import kotlin.math.round

fun main() {
    val purchaseAmount = 15000  // сумма покупки
    val regularCustomer = true  // является ли пользователь постоянным покупателем

    var discountAmount = when {
        purchaseAmount in 1001..10000 -> 100
        purchaseAmount > 10000 -> (purchaseAmount * 0.05).toInt()
        else -> 0
    }

    println("Покупка — $purchaseAmount рублей")
    println("После применения ${discountAmount * 100.0 / purchaseAmount}% скидки — ${purchaseAmount - discountAmount} рублей")

    var finalAmount = purchaseAmount - discountAmount

    if (regularCustomer) {
        val additionalDiscount = (finalAmount * 0.01).toInt()
        discountAmount += additionalDiscount
        finalAmount -= additionalDiscount

        println("После применения 1% скидки — $finalAmount рублей")
    }

    println("Финальная сумма с учетом скидки: $finalAmount руб.")
}
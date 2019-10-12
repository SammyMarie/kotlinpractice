package challenges

import samples.model.ClothingItem
import java.math.BigDecimal
import java.text.NumberFormat

fun main() {
    val basket = mutableMapOf<ClothingItem, Int>()
    with(basket) {
        put(ClothingItem("Shirt", "XL", BigDecimal("14.99")), 2)
        put(ClothingItem("Pants", "34", BigDecimal("19.99")), 5)
        put(ClothingItem("Hat", "8.5", BigDecimal("24.99")), 8)
    }
    println(basket)

    var total = 0.0
    val currency = NumberFormat.getCurrencyInstance()

    for ((clothing, quantity) in basket) {
        val itemTotal: Double = clothing.price.toDouble().times(quantity)
        println("Item ${clothing.type} @ ${currency.format(clothing.price)} = ${currency.format(itemTotal)}")
        total += itemTotal
    }

    println("--------------------")
    println("Total: ${currency.format(total)}")
}
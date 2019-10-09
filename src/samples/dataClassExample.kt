package samples

import java.math.BigDecimal

fun main() {
    val item = ClothingItem("Shirt", "L", BigDecimal("19.99"))
    println(item)

    val secondItem = ClothingItem("M", BigDecimal("14.99"))
    println(secondItem)
}
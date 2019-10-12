package samples

import samples.model.Pants
import samples.model.Shirt
import java.math.BigDecimal

fun main() {
    val firstItem = Shirt("XL", BigDecimal("19.99"))
    val secondItem = Pants("36", BigDecimal("24.99"))

    val instructions = when (if (firstItem.price > secondItem.price) firstItem else secondItem) {
        is Shirt -> "Button it!"
        is Pants -> "Buckle it!"
    }

    println(instructions)
}
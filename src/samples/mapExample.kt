package samples

import samples.model.ClothingItem
import java.math.BigDecimal

fun main() {
    val colorMap = mapOf<String, Long>(Pair("Red", 0xFF0000), Pair("Green", 0x00FF00), Pair("Blue", 0x0000FF))
    println(colorMap)

    val stateMap = mutableMapOf<String, String>()
    stateMap["CA"] = "Sacramento"
    stateMap["OR"] = "Salem"
    stateMap["WA"] = "Olympia"

    println(stateMap)
    for (state in stateMap.keys) {
        println("The capital of $state is ${stateMap[state]}")
    }
    println()
    for ((state, capital) in stateMap) {
        println("The capital of $state is $capital")
    }

    val cart = mutableMapOf<ClothingItem, Int>()
    with(cart) {
        cart[ClothingItem("Shirt", "XL", BigDecimal("14.99"))] = 2
        put(ClothingItem("Pants", "34", BigDecimal("14.99")), 4)
        put(ClothingItem("Hat", "8.5", BigDecimal("14.99")), 1)
    }
    println(cart)
}
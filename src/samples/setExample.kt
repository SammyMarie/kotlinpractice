package samples

import samples.model.ClothingItem
import java.math.BigDecimal

fun main() {
    val colorSet = mutableSetOf("Red", "Green", "Blue")
    println(colorSet)
    colorSet.add("Purple")
    colorSet.remove("Blue")
    println(colorSet)
    println(colorSet::class.simpleName)

    val colorList = colorSet.toMutableList()
    colorList.removeAt(0)
    colorList.add("Purple")
    println(colorList)

    val colors = colorList.toMutableSet()
    println("From list to set: $colors")

    val itemSet = mutableSetOf<ClothingItem>()
    itemSet.add(ClothingItem("Shirt", "XXL", BigDecimal("14.99")))
    itemSet.add(ClothingItem("Shirt", "M", BigDecimal("14.99")))
    println(itemSet)
}
package samples

import samples.model.ClothingItem
import samples.model.Employee
import java.math.BigDecimal
import java.text.NumberFormat

fun main() {
    val item = ClothingItem("Shirt", "L", BigDecimal("19.99"))
    println(item)

    val secondItem = ClothingItem("M", BigDecimal("14.99"))
    println(secondItem)
    secondItem.price = BigDecimal("15.09")

    val formatter = NumberFormat.getCurrencyInstance()
    println("Item price = ${formatter.format(secondItem.price)}")

    val employee = Employee("Johnson", "Ohana")
    println("That employee is ${employee.fullName}")
}
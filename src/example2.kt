import kotlin.math.abs
import kotlin.math.round

fun main() {
    val num1 = 15
    val num2 = 10

    val sum : Int = num1 + num2
    println("sum = $sum")

    val sum2 : Int = num1.plus(num2)
    println("sum2 = $sum2")

    val neg = -152.5
    val absolute = abs(neg)
    println("absolute = $absolute")
    println("rounded = ${round(absolute)}")
}
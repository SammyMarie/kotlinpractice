package challenges

import challenges.Operation.*

fun main() {
    print("Enter first value: ")
    val firstNumber: String? = readLine()
    print("Enter second value: ")
    val secondNumber: String? = readLine()
    print("Enter one operator(+ - / % *): ")

    try {
        val operator: String? = readLine()
        val firstDouble: Double = firstNumber!!.toDouble()
        val secondDouble: Double = secondNumber!!.toDouble()

        val result = calculateValues(firstDouble, secondDouble, operator)
        printHeader("Answer: $result")
    } catch (knpe: KotlinNullPointerException) {
        println("Value is null")
    } catch (nfe: NumberFormatException) {
        println("${nfe.message} is not a number")
    } catch (exc: Exception) {
        println(exc.message)
    }
}

fun printHeader(label: String) {
    println("*********************")
    println(label)
    print("*********************")
}

fun calculateValues(first: Double, second: Double, operator: String?): Double {
    return when (operator) {
        ADD.operator -> first.plus(second)
        SUBTRACT.operator -> first.minus(second)
        DIVIDE.operator -> first.div(second)
        MULTIPLY.operator -> first.times(second)
        MODULUS.operator -> first.rem(second)
        else -> throw Exception("Unknown Operator")
    }
}
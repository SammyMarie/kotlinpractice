package samples

import samples.model.MathLib
import samples.model.MathLib.Companion.receiveInput

fun main() {
    try {
        val mathLib = MathLib()
        while (true) {
            val number: Double = receiveInput("Enter a Number: ")
            mathLib.addValue(number)
            println("Current total: ${mathLib.runningTotal}")
        }
    } catch (nfe: NumberFormatException) {
        println("${nfe.message} is not a number")
    } catch (exc: Exception) {
        println(exc.message)
    }
}

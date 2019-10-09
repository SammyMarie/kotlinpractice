package samples

class MathLib {
    var runningTotal = 0.0
    fun addValue(value: Double) {
        runningTotal += value
    }

    companion object {

        fun addsValues(firstNumber: Double, secondNumber: Double) = firstNumber + secondNumber
        fun receiveInput(prompt: String): Double {
            print(prompt)
            val userInput: String? = readLine()
            val number = userInput!!.toBigDecimal()
            return number.toDouble()
        }
    }
}
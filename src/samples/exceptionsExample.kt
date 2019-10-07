fun main() {
    try {
        print("Value 1: ")
        val firstValue: String? = readLine()
        val firstDouble: Double = firstValue!!.toDouble()

        print("Value 2: ")
        val secondValue: String? = readLine()
        val secondDouble: Double = secondValue!!.toDouble()

        val sum = firstDouble.plus(secondDouble)
        println("Answer: $sum")
    } catch (exc: KotlinNullPointerException) {
        println("Value is null")
    } catch (npe: NumberFormatException) {
        println("${npe.message} is not a number")
    }
}
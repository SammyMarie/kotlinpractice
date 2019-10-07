package samples

fun main() {
    val num1 = 25
    var num2 = 10

    val match: Boolean = (num1 == num2)
    num2 = num1
    println("Matched = $match")
    println("The value of num2 is $num2")
    val match2 : Boolean = num1.equals(num2)
    println("Matched 2 = $match2")
    num2 = 23
    println("Comparison result is = ${num1.compareTo(num2)}")
}
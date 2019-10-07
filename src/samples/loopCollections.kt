package samples

fun main() {
    val colors: Array<String> = arrayOf("Red", "Green", "Blue")
    val values: IntArray = intArrayOf(1, 3, 5, 7, 9)

    printHeader("For each loop")
    for (color in colors) {
        println(color)
    }

    for (value in values) {
        println(value)
    }

    printHeader("For loop with indices")
    for (index in values.indices) {
        println(values[index])
    }

    println()
    for (index in values.indices step 2) {
        println(values[index])
    }

    for (element in colors) {
        println(element)
    }
}

fun printHeader(label: String) {
    println("*********************")
    println(label)
    println("*********************")
}
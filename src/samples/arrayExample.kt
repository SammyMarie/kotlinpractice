package samples

fun main() {
    val firstArray = arrayOf("Red", "Green", "Blue")
    for (element in firstArray) {
        println(element)
    }

    val mixedArray = arrayOf("A string", 12)
    printer(mixedArray)

    val nullsArray = arrayOfNulls<String>(3)
    for (element in nullsArray) {
        println(element)
    }
}

fun printer(arrays: Array<Any>) {
    for (element in arrays) {
        println(element)
    }
}
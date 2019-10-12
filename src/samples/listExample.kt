package samples

fun main() {
    val colorList = listOf("Red", "Green", "Blue")
    println(colorList)
    println("Number of colors: ${colorList.size}")
    println(colorList::class.simpleName)

    val secondColorList = mutableListOf<String>()
    secondColorList.add("Red")
    secondColorList.add("Green")
    secondColorList.add("Blue")
    println(secondColorList)

    secondColorList.sort()
    println("Mutable sorted list: $secondColorList")
    val sortedList = secondColorList.sortedDescending()
    println("Descending sorted list: $sortedList")
}
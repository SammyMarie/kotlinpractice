package samples

fun main() {
    var nullValue: String? = null
    println("Value is: $nullValue")

    val leng: Int? = nullValue?.length

    val message = if (leng != null) "Length: $leng" else "Length is null"
    println(message)

    val leng2: Int = leng ?: -1
    println("The value of length2 is $leng2")

    try {
        val leng3 = leng!! //used to assert the value is null
        println("The value of length 3 is $leng3")
    } catch (knpe: KotlinNullPointerException) {
        println("Length 3 is null: ${knpe.message}")
    }
}
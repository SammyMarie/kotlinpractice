import java.lang.StringBuilder

fun main() {
    var myString = "Hello!"
    println(myString)
    val emptyString = String()
    println(emptyString)

    val charArray = myString.toCharArray()
    println(charArray.toList())
    val byteString = myString.toByteArray()
    println(byteString.toList())

    myString += " and welcome!"
    println(myString)

    val stringLength = myString.length
    for(index in 0 until stringLength){
        val chars = myString[index]
        println(chars)
    }

    val parsing = myString.indexOf("w")
    val subs = myString.substring(parsing)
    println(subs)

    val myString1 = myString.toUpperCase()
    val match = myString.equals(myString1, true)
    println("Do they match? $match")

    val builder = StringBuilder("To be or not to be\n").append("That is a very good question\n")
                                                           .append("Whether 'tis nobler in the mind\n")
                                                           .append("To suffer the slings and arrows")

    val result = builder.toString()
    println(result)

}
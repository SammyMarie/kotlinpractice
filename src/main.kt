const val myName = "Sammy"

fun main() {
    val person = Person(myName)
    println("The initial value of Person object is $person")

    val num2: Double = 5.toDouble()
    println("The value of num2 is $num2")
    println("My name is $myName")
    println("The type for num2 is ${num2::class.qualifiedName}")
    var myInt = num2.toInt()
    println("The of myInt is $myInt")
}

data class Person(val name : String)
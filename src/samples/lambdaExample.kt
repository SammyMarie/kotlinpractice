package samples

fun main() {
    val hello = {
        println("Hello World!")
    }
    hello()
    hello.invoke()

    val sayHello = { user: String, age: Int ->
        println("Hello, $user, you're $age years old")
    }

    sayHello("Sammy", 35)

    val states = arrayOf("New York", "New Hampshire", "Vermont", "Rhode Island", "Nebraska")
    //val sortedArray = states.sortedBy { state -> state.length }
    val sortedArray = states.sortedBy { it.length }.filter { it.startsWith("n", true) }
    for (state in sortedArray) {
        println(state)
    }
}
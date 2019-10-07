fun main() {
    val states: Array<String> = arrayOf("CA", "OR", "WA")

    printHeader("While loop")
    var counter = 0
    while (counter < states.size) {
        println("Counter = $counter")
        println("State = ${states[counter]}")
        counter++
    }

    printHeader("Do/While loop")
    counter = 0
    do {
        println("State = ${states.get(counter)}")
        counter++
    } while (counter < states.size)
}
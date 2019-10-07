fun main() {
    print("Enter a state abbreviation: ")
    val state : String? = readLine()

    /*if(state == "CA"){
        println("The capital is Sacramento")
    } else if(state == "OR"){
        println("The capital is Salem")
    }else{
        println("I don't know that state")
    }*/

    val capital = when(state){
        "CA" -> "Sacramento"
        "OR" -> "Salem"
        else -> "Unknown"
    }

    println("The capital is $capital")

    when(state){
        "CA", "OR", "WA" -> println("West Coast")
        "NH", "VT", "MA" -> println("New England")
        else -> println("Somewhere else")
    }

    when(50){
        in 1.. 35 -> println("Not yet")
        in 40.. 45 -> println("Close enough")
        else -> {
            println("Definitely not")
            println("No, not really")
        }
    }
}
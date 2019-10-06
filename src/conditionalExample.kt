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
}
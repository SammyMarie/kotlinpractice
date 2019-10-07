package samples

fun main() {
    val firstNumber = 12.0
    val secondNumber = 34.5

    val result = addValues(firstNumber, secondNumber)
    val secResult = calValues(param2 = secondNumber, param1 = firstNumber, operator = "-")
    println("The result is $result")
    println("The result is $secResult")
    changeSomething(4.5)
    val sum = addValues(3, 2, 4, 5, 6)
    println("The sum of all the numbers = $sum")
}

fun addValues(param1: Double, param2: Double): Double {
    return param1 + param2
}

fun calValues(param1: Double, param2: Double, operator: String = "+"): Double{
    if(operator.equals("+")){
        return param1 + param2
    }else if(operator.equals("-")){
        return param1 - param2
    }else{
        return -1.0
    }
}

fun changeSomething(param: Double){
    var paramCopy = param
    paramCopy++
    println("Copy of method parameter is $paramCopy")
}

fun addValues(vararg numbers : Int) : Int{
    var result = 0
    for(index in numbers){
        result += index
    }
    return result
}
package samples

import samples.model.SubClass
import samples.model.SuperClass

fun main() {
    val something = Any()
    println(something)

    val sup = SuperClass(42)
    println(sup)

    val sub = SubClass(123)
    println(sub)

    println("Superclass operation: ${sup.multiply(23)}")
    println("Subclass operation: ${sub.multiply(5)}")
}
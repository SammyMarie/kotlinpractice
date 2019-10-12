package samples

fun main() {
    val something: Any = Any()
    println(something)

    val sup = SuperClass(42)
    println(sup)

    val sub = SubClass(123)
    println(sub)
}

open class SuperClass(anInt: Int) {
    protected val _anInt = anInt

    override fun toString(): String {
        return "SuperClass{anInt: $_anInt}"
    }
}

class SubClass(anInt: Int) : SuperClass(anInt) {
    override fun toString(): String {
        return "Subclass{anInt: $_anInt}"
    }
}
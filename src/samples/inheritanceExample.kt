package samples

fun main() {
    val something: Any = Any()
    println(something)

    val sup = SuperClass(42)
    println(sup)

    val sub = SubClass(123)
    println(sub)

    println("Superclass operation: ${sup.multiply(23)}")
    println("Subclass operation: ${sub.multiply(5)}")
}

open class SuperClass(anInt: Int) {
    protected val _anInt = anInt

    override fun toString(): String {
        return "${this::class.simpleName}: {anInt: $_anInt}"
    }

    open fun multiply(factor: Int): Int {
        return _anInt.times(factor)
    }
}

class SubClass(anInt: Int) : SuperClass(anInt) {
    override fun multiply(factor: Int): Int {
        return super.multiply(factor).times(factor)
    }
}
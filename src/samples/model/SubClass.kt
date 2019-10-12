package samples.model

class SubClass(anInt: Int) : SuperClass(anInt) {
    override fun multiply(factor: Int): Int {
        return super.multiply(factor).times(factor)
    }
}
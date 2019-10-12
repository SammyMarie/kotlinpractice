package samples.model

class Retriever : Dog, Cat {
    override var fur: String
        get() = "golden"
        set(value) {}

    override fun speak() {
        super<Dog>.speak()
        super<Cat>.speak()
    }
}
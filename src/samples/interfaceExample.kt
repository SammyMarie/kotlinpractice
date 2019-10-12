package samples

import samples.model.Dog
import samples.model.Retriever

fun main() {
    val buster = Retriever()
    makeItTalk(buster)
    reportBreed("Buster", buster)
    println("This dog's fur is ${buster.fur}")
}

fun makeItTalk(dog: Retriever) {
    dog.speak()
}

fun reportBreed(name: String, dog: Dog) {
    println("$name is a ${dog::class.simpleName}")
}
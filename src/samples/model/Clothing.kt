package samples.model

import java.math.BigDecimal

sealed class Clothing(val type: String) {
    abstract val size: String
    abstract val price: BigDecimal
}

data class Shirt(override var size: String, override var price: BigDecimal) : Clothing("Shirt")
data class Pants(override var size: String, override var price: BigDecimal) : Clothing("Pants")
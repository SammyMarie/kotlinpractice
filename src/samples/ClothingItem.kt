package samples

import java.math.BigDecimal

data class ClothingItem(var type: String?, var size: String, var price: BigDecimal) {
    init {
        type = type?.toUpperCase() ?: "UNKNOWN"
    }

    constructor(size: String, price: BigDecimal) : this(null, size, price) {
        //type = "Unknown"
    }
}
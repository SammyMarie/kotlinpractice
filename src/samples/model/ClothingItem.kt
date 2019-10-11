package samples.model

import java.math.BigDecimal

data class ClothingItem(private var _type: String?, var size: String, private var _price: BigDecimal) {
    init {
        _type = _type?.toUpperCase() ?: "UNKNOWN"
    }

    var type: String? = _type
        get() = field ?: "Unknown"

    var price = _price
        set(value) {
            field = value.multiply(BigDecimal("0.9"))
        }

    constructor(size: String, price: BigDecimal) : this(null, size, price) {
        //type = "Unknown"
    }
}
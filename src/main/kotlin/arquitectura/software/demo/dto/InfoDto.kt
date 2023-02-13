package arquitectura.software.demo.dto

import java.math.BigDecimal
import java.math.BigInteger

class InfoDto (
    var timestamp: BigInteger?,
    var rate: BigDecimal?)
{
    constructor() : this(null, null)
    override fun toString(): String {
        return "timestamp: $timestamp rate: $rate"
    }
}
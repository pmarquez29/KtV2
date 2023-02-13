package arquitectura.software.demo.dto

import java.math.BigDecimal

data class RequestDto(
        var from: String,
        var to: String,
        var amount: BigDecimal
) {
    override fun toString(): String {
        return "RequestDto(from='$from', to='$to', amount=$amount)"
    }
}

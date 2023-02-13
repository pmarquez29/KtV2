package arquitectura.de.computadoras.KotlinVersion.exceptions

import arquitectura.de.computadoras.KotlinVersion.dto.ResponseDto
import org.springframework.http.ResponseEntity

class Controller {

    fun zeroException(e: IllegalArgumentException): ResponseEntity<ResponseDto> {
        val responseDto = ResponseDto(null, false, e.message.toString())
        return ResponseEntity.badRequest().body(responseDto)
    }

}
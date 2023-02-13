package arquitectura.software.demo.exceptions

import arquitectura.software.demo.dto.ResponseDto
import org.springframework.http.ResponseEntity

class Controller {

    fun zeroException(e: IllegalArgumentException): ResponseEntity<ResponseDto<Any>> {
        val responseDto = ResponseDto<Any>(null, false, e.message.toString())
        return ResponseEntity.badRequest().body(responseDto)
    }

}
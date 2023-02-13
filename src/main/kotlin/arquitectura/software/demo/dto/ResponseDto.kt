package arquitectura.software.demo.dto

class ResponseDto(
        var data: Any?,
        var success: Boolean,
        var message: String
) {
    override fun toString(): String {
        return "ResponseDto(data=$data, success=$success, message='$message')"
    }
}

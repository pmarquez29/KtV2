package arquitectura.software.demo.dto

class ResponseDto<T>(
        var data: Any?,
        var success: Boolean?,
        var message: String?
) {
    constructor() : this(null, null, null)
    override fun toString(): String {
        return "ResponseDto(data=$data, success=$success, message='$message')"
    }
}

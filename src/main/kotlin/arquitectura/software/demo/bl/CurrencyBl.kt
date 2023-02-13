package arquitectura.software.demo.bl

import arquitectura.software.demo.dto.CurrencyDto
import com.fasterxml.jackson.databind.ObjectMapper
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.springframework.stereotype.Service
import java.io.IOException
import java.math.BigDecimal

@Service
class CurrencyBl {
    @Throws(IOException::class)
    fun get(from: String, to: String, amount: BigDecimal): CurrencyDto {
        if (amount <= BigDecimal.ZERO) {
            throw IllegalArgumentException("EL MONTO NO PUEDE SER MENOR O IGUAL A CERO")
        }
        val client = OkHttpClient.Builder().build()
        val request = Request.Builder()
                .url("https://api.apilayer.com/exchangerates_data/convert?from=$from&to=$to&amount=$amount")
                .addHeader("apikey", "hvQIMf7LSCxyyLMJ0mDuLSsihHDEcDej")
                .method("GET", null)
                .build()

        val response = client.newCall(request).execute()
        val result = response.body()!!.string()

        val mapper = ObjectMapper()
        val currencyDto = mapper.readValue(result, CurrencyDto::class.java)
        return currencyDto

    }
}
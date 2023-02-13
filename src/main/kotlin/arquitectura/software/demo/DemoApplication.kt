package arquitectura.software.demo

import ch.qos.logback.classic.LoggerContext
import ch.qos.logback.classic.joran.JoranConfigurator
import ch.qos.logback.core.joran.spi.JoranException
import ch.qos.logback.core.util.StatusPrinter
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication {
	//companion object {
	private val logger = LoggerFactory.getLogger(DemoApplication::class.java)
	//}
	fun main(args: Array<String>) {

		runApplication<DemoApplication>(*args)

		val context = LoggerFactory.getILoggerFactory() as LoggerContext
		val configurator = JoranConfigurator()
		configurator.context = context
		context.reset()
		try {

			configurator.doConfigure("src/main/java/logback.xml")
		} catch (e: JoranException) {
			throw RuntimeException(e)
		}

		StatusPrinter.printInCaseOfErrorsOrWarnings(context)
	}
}

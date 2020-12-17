package com.araz.jukebox

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@OpenAPIDefinition(
	info = Info(
		title = "Carbon Dioxide Measurement Application",
		version = "1.0",
		description = "Service capable of collecting data from sensors and alert if the CO2 concentrations reach critical levels"
	)
)
open class JukeboxApplication

fun main(args: Array<String>) {
	runApplication<JukeboxApplication>(*args)
}

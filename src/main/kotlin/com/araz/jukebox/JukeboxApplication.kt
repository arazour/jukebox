package com.araz.jukebox

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@OpenAPIDefinition(
	info = Info(
		title = "Jukebox",
		version = "ny.1.0",
		description = "Service that let's you listen to music together"
	)
)
open class JukeboxApplication

fun main(args: Array<String>) {
	runApplication<JukeboxApplication>(*args)
}

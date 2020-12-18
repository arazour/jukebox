package com.araz.jukebox.config

import org.springframework.context.annotation.Configuration
import org.modelmapper.ModelMapper
import org.modelmapper.PropertyMap
import org.modelmapper.convention.MatchingStrategies
import org.springframework.context.annotation.Bean
import java.time.LocalDateTime
import java.util.*

@Configuration
class AppConfig {

    @Bean
    fun modelMapper(): ModelMapper {
        val mapper= ModelMapper()
        mapper.configuration.isFieldMatchingEnabled = true
        mapper.configuration.isSkipNullEnabled = true
        mapper.configuration.matchingStrategy = MatchingStrategies.STANDARD
        mapper.configuration.isDeepCopyEnabled = true
        mapper.configuration.fieldAccessLevel = org.modelmapper.config.Configuration.AccessLevel.PRIVATE
        return mapper
    }

}
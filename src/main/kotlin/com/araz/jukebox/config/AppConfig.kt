package com.araz.jukebox.config

import org.springframework.context.annotation.Configuration
import org.modelmapper.ModelMapper
import org.modelmapper.convention.MatchingStrategies
import org.springframework.context.annotation.Bean

@Configuration
open class AppConfig {

    @Bean
    open fun modelMapper(): ModelMapper {
        val mapper= ModelMapper()
        mapper.configuration.isFieldMatchingEnabled = true
        mapper.configuration.isSkipNullEnabled = true
        mapper.configuration.matchingStrategy = MatchingStrategies.LOOSE
        mapper.configuration.fieldAccessLevel = org.modelmapper.config.Configuration.AccessLevel.PRIVATE
        return mapper
    }

}
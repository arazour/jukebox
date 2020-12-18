package com.araz.jukebox.service

import com.araz.jukebox.data.Program
import com.araz.jukebox.repository.ProgramRepository
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProgramService {

    @Autowired
    lateinit var programRepository: ProgramRepository

    @Autowired
    lateinit var modelMapper: ModelMapper

    fun getProgram(id: Long): Program {
        return modelMapper.map(programRepository.findById(id).get(), Program::class.java)
    }
}
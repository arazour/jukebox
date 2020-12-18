package com.araz.jukebox.service

import com.araz.jukebox.data.Program
import com.araz.jukebox.repository.PlayScheduleRepository
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.Duration
import java.time.LocalDateTime
import java.util.*

@Service
class PlayScheduleService {

    @Autowired
    lateinit var playScheduleRepository: PlayScheduleRepository

    @Autowired
    lateinit var programService: ProgramService

    @Autowired
    lateinit var modelMapper: ModelMapper

    fun currentProgram(roomId: Long): Program {
        val playSchedule = playScheduleRepository.findByRoom_Id(roomId)
        val program = playSchedule.programs.first { p ->
            p.time?.before(Date())!!
                    && (LocalDateTime.now().plus(Duration.ofMillis(p.song!!.duration)).isAfter(LocalDateTime.now()))
        }
        return modelMapper.map(program, Program::class.java)
    }

    fun nextProgram(roomId: Long, currentProgramId: Long): Program {
        val playSchedule = playScheduleRepository.findByRoom_Id(roomId)
        val currentProgram = programService.getProgram(currentProgramId)
        val program = playSchedule.programs.first { p -> p.time?.after(currentProgram.time)!! }
        return modelMapper.map(program, Program::class.java)
    }
}
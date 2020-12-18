package com.araz.jukebox.controller

import com.araz.jukebox.data.PlaySchedule
import com.araz.jukebox.data.Program
import com.araz.jukebox.data.Song
import com.araz.jukebox.service.PlayScheduleService
import com.araz.jukebox.service.SongService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime
import java.util.*
import java.util.concurrent.atomic.AtomicLong

@RestController("API")
@RequestMapping("/api/v1")
class ApiController {

    @Autowired
    lateinit var songService: SongService

    @Autowired
    lateinit var playScheduleService: PlayScheduleService

    val counter = AtomicLong()

    @GetMapping("/play-schedule")
    fun playSchedule() : PlaySchedule {
        val resp = PlaySchedule(counter.incrementAndGet(), 1,
                listOf(Program(1, Date(), Song(1, "file", "url", 123456))))
        return resp
    }

    @GetMapping("/current")
    fun current(): Program {
        return playScheduleService.currentProgram(1)
    }

    @GetMapping("/next", params = ["cid"])
    fun next(cid: Long): Program {
        return playScheduleService.nextProgram(1, cid)
    }

    @GetMapping("/song")
    fun songs(): List<Song> {
        return songService.findAll()
    }

    @PostMapping("/song")
    fun saveSong(@RequestBody song: Song) : Song {
        return songService.save(song)
    }

}
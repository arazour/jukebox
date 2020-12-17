package com.araz.jukebox.controller

import com.araz.jukebox.data.PlaySchedule
import com.araz.jukebox.data.Program
import com.araz.jukebox.data.Song
import com.araz.jukebox.model.SongEntity
import com.araz.jukebox.service.SongService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime
import java.util.concurrent.atomic.AtomicLong

@RestController("/api/v1")
class JukeboxController {

    @Autowired
    lateinit var songService: SongService

    val counter = AtomicLong()

    @GetMapping("/play-schedule")
    fun playSchedule() : PlaySchedule {
        val resp = PlaySchedule(counter.incrementAndGet(), 1,
                listOf(Program(1, LocalDateTime.now(), Song(1, "file", "url", 123456))))
        return resp
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
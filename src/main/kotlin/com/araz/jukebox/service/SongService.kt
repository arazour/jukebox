package com.araz.jukebox.service

import com.araz.jukebox.data.Song
import com.araz.jukebox.model.SongEntity
import com.araz.jukebox.repository.SongRepository
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SongService {

    @Autowired
    lateinit var songRepo: SongRepository

    @Autowired
    lateinit var modelMapper: ModelMapper

    fun save(s: Song): Song {
        val se = songRepo.save(modelMapper.map(s, SongEntity::class.java))
        return modelMapper.map(se, Song::class.java)
    }

    fun findAll(): List<Song> {
        return songRepo.findAll().map { s -> modelMapper.map(s, Song::class.java) }
    }

}
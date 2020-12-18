package com.araz.jukebox.repository

import com.araz.jukebox.model.ProgramEntity
import com.araz.jukebox.model.SongEntity
import org.springframework.data.repository.CrudRepository

interface ProgramRepository : CrudRepository<ProgramEntity, Long>
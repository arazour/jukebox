package com.araz.jukebox.repository

import com.araz.jukebox.model.PlayScheduleEntity
import org.springframework.data.repository.CrudRepository

interface PlayScheduleRepository : CrudRepository<PlayScheduleEntity, Long> {
    fun findByRoom_Id(roomId: Long): PlayScheduleEntity

}
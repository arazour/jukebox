package com.araz.jukebox.data

import java.time.LocalDateTime
import java.time.ZonedDateTime

data class Program(var id: Long? = null, var time: LocalDateTime = LocalDateTime.now(), var song: Song? = null)
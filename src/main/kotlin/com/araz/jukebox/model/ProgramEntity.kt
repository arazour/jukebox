package com.araz.jukebox.model

import java.time.LocalDateTime
import java.time.ZonedDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "program")
class ProgramEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var time: Date? = null

    @ManyToOne(targetEntity = SongEntity::class)
    var song: SongEntity? = null
}
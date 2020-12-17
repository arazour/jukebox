package com.araz.jukebox.model

import javax.persistence.*

@Entity
@Table(name = "play_schedule")
class PlayScheduleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @OneToOne(targetEntity = RoomEntity::class)
    var room: RoomEntity? = null

    @OneToMany
    var programs: List<ProgramEntity> = emptyList()
}
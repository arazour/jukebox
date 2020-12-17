package com.araz.jukebox.model

import javax.persistence.*

@Entity
@Table(name = "room")
class RoomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var name: String = ""
}
package com.araz.jukebox.model

import lombok.AllArgsConstructor
import javax.persistence.*

@Entity
@Table(name = "song")
class SongEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var fileName: String = ""
    var url: String = ""
    var duration: Long = 0
}
package com.araz.jukebox.data

data class Song(val id: Long?, val fileName: String, val url: String, val duration: Long){
constructor() : this(null, "", "", 0)
}

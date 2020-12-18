package com.araz.jukebox.controller;

import com.araz.jukebox.service.PlayScheduleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class WebController {

    @Autowired
    lateinit var playScheduleService: PlayScheduleService

    @GetMapping("/")
    fun index(model: Model) : String {
        return "index"
    }

    @GetMapping("/schedule")
    fun schedule(model: Model): String {
        return "schedule"
    }
}
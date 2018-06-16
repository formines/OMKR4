package com.example.OMKR4.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/")
class indexController {

    @GetMapping("/index")
    fun hello(
            @RequestParam(value = "name", required = false, defaultValue = "world") name: String,
            model: Model): String {
        model.addAttribute("name", name)
        return "index"
    }
}
package com.example.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/")
class HtmlController {
    @GetMapping
    fun home(model: Model): String {
        model["title"] = "This is the home page"
        return "blog"
    }


}
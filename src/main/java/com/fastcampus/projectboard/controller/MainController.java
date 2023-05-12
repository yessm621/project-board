package com.fastcampus.projectboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
<<<<<<< Updated upstream
        return "redirect:/articles";
=======
        return "forward:/articles";
>>>>>>> Stashed changes
    }
}

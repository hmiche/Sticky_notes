package com.mvc.sticky_notes.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StickyNoteController {

    @GetMapping("/hello-world")
    public String  Helloworld(){
        return "home";
    }
}

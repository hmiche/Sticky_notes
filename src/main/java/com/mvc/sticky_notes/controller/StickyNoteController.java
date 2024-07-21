package com.mvc.sticky_notes.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StickyNoteController {

    @GetMapping("")
    public String  home(){
        return "home";
    }

    @GetMapping("/my-notes")
    public String  myNotes(){
        return "layout/my-notes";
    }

    @GetMapping("/sticky-note/{id}")
    public String  stickyNote(@PathVariable(name = "id") Integer id){
        return "sticky-note";
    }

    @GetMapping("/edit-sticky-note/{id}")
    public String  editStickyNote(@PathVariable(name = "id") Integer id){
        return "edit-sticky-note";
    }
}

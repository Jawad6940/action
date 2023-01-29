package com.example.githubaction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controoler {
    @GetMapping("/{hi}")
    public String hi(@PathVariable("hi") String hi){
        return "welcome"+hi;
    }
}

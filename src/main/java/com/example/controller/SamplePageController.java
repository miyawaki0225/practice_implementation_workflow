package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SamplePageController {
    @GetMapping("/samplepage")
    public String getUserList() {
        
        return "sample/samplepage";
    }

    @PostMapping("/samplepage")
    public String postUserList() {
        return "sample/samplepage";
    }
}

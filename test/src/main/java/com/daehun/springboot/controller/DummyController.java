package com.daehun.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @GetMapping("/dummy")
    public String getDummy() {
        return "dummy";
    }
}

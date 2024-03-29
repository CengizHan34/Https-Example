package com.techprimers.httpsexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"/hello"})
public class HelloResource {

    @GetMapping(value = {""})
    public String hello() {
        return "Helloooo!!";
    }
}

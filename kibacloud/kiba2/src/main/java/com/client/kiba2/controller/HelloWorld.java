package com.client.kiba2.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/helloWorld_kiba2")
@RestController
public class HelloWorld {
    @RequestMapping(value = "/GetName", method = RequestMethod.GET)
    public String GetName() {
        return "我是Kiba518";
    }

    @RequestMapping(value = "/GetAge", method = {RequestMethod.GET, RequestMethod.POST})
    public int GetAge() {
        return 518;
    }

    @PostMapping("/GetAge1")
    public int GetAge1() {
        return 518;
    }

    @GetMapping("/GetAge2")
    public int GetAge2() {
        return 518;
    }
}


package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @className: TestController
 * @description: TODO
 * @Author: zhuofengli
 * @Date: 2023/3/4 20:29
 */

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello! Post" + name;
    }
}

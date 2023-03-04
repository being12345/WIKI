package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
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

    //customize properties if properties isn't set using default: Test
    @Value("${test.hello:Test}")
    private String testHello;

    @GetMapping("/hello")
    public String hello() {
        return "Hello!" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello! Post" + name;
    }
}

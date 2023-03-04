package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

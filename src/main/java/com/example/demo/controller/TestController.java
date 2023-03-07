package com.example.demo.controller;

import com.example.demo.domain.Test;
import com.example.demo.service.TestService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello() {
        return "Hell!" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello! Post" + name;
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}

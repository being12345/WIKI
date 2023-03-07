package com.example.demo.controller;

import com.example.demo.domain.Demo;
import com.example.demo.service.DemoService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @className: DemoController
 * @description: TODO
 * @Author: zhuofengli
 * @Date: 2023/3/4 20:29
 */

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Resource
    private DemoService demoService;

    @GetMapping("/list")
    public List<Demo> list() {
        return demoService.list();
    }
}

package com.example.demo.service;

import com.example.demo.domain.Demo;
import com.example.demo.mapper.DemoMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: DemoService
 * @description: TODO
 * @Author: zhuofengli
 * @Date: 2023/3/6 19:25
 */

@Service    //必须添加 service 注解
public class DemoService {

    @Resource   //注入
    private DemoMapper demoMapper;

    public List<Demo> list() {
        return demoMapper.selectByExample(null);
    }
}

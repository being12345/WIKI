package com.example.demo.service;

import com.example.demo.domain.Test;
import com.example.demo.mapper.TestMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: TestService
 * @description: TODO
 * @Author: zhuofengli
 * @Date: 2023/3/6 19:25
 */

@Service    //必须添加 service 注解
public class TestService {

    @Resource   //注入
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }
}

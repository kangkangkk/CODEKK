package com.kangkang.controller;

import com.kangkang.param.test;
import com.kangkang.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/test")
public class testController {

    @Autowired
    com.kangkang.service.testService testService;

    LinkedBlockingQueue queuq=new LinkedBlockingQueue();
    ThreadPoolExecutor threadPool=new ThreadPoolExecutor(1,1,100L, TimeUnit.DAYS,new LinkedBlockingQueue<>(1));
    @PostMapping("/V1")
    public String test(){

        return "SUCCESS245";
    }
}

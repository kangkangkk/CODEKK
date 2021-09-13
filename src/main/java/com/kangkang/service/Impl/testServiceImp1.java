package com.kangkang.service.Impl;

import com.kangkang.service.testService;
import org.springframework.stereotype.Component;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Component
public class testServiceImp1 implements testService {
    @Override
    public void test() {
        ThreadPoolExecutor executors=new ThreadPoolExecutor(10,20,30L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<>());
        System.out.println("test1");
    }
}

package com.demo.service.impl;

import com.demo.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by yangyang115 on 17-12-14.
 */
@Service
public class HelloServiceImpl implements HelloService{

    public String sayHello(){
        return "Hello World, spring boot web!";
    }
}

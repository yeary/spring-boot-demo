package com.demo.controller;

import com.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yangyang115 on 17-12-14.
 */
@RestController
public class HelloController {

    //@Autowired
    //HelloService helloService;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/")
    public String greeting() {
        String providerMsg = restTemplate.getForEntity("http://EUREKA.PROVIDER/",
                String.class).getBody();
        return "Hello,Customer! msg from provider : <br/><br/> " + providerMsg;
    }
}

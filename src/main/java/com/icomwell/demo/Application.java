package com.icomwell.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuguocheng on 2016/11/11.
 */
@RestController
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
}
}

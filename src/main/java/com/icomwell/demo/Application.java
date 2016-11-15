package com.icomwell.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuguocheng on 2016/11/11.
 */
@RestController
@EnableAutoConfiguration
@EnableConfigurationProperties({PrivilegeSettings.class})
public class Application {

    @Autowired
    private PrivilegeSettings settings;

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @RequestMapping("/hello")
    public String hello(){
        return String.format("Hello %s,%s",settings.getName(),settings.getAge());
    }

    public static void main(String[] args){
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class,args);

    }
}

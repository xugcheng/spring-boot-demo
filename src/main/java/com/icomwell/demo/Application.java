package com.icomwell.demo;

import com.icomwell.demo.config.PrivilegeSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuguocheng on 2016/11/11.
 */
@RestController
@EnableAutoConfiguration
@EnableConfigurationProperties({PrivilegeSettings.class})
public class Application {

    @Autowired
    private PrivilegeSettings settings;

    @Value("${name.first}")
    private String firstName;

    @Value("${name.second}")
    private String secondName;

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/hello")
    public String hello() {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("name", settings.getName());
        data.put("age", settings.getAge());
        data.put("firstName", firstName);
        data.put("secondName", secondName);
        return data.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

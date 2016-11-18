package com.xugc;

import com.xugc.config.JdbcConfig;
import com.xugc.user.action.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuguocheng on 2016/11/11.
 */
@RestController
@EnableAutoConfiguration
@EnableConfigurationProperties({JdbcConfig.class})
public class Application {

    @Autowired
    private JdbcConfig jdbcConfig;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/jdbc",method = RequestMethod.GET)
    public JdbcConfig jdbcConfig(){
        return this.jdbcConfig;
    }

    public static void main(String[] args) {
        SpringApplication.run(new Object[]{Application.class, UserController.class},args);
    }
}

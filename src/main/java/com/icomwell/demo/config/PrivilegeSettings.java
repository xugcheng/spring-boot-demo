package com.icomwell.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by xuguocheng on 2016/11/15.
 */
@ConfigurationProperties(prefix = "privilege", locations = "classpath:config/privilege.properties")
public class PrivilegeSettings {
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

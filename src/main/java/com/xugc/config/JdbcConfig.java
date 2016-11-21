package com.xugc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/11/18.
 */
@Component
@ConfigurationProperties(prefix = "jdbc")
public class JdbcConfig {

    private String dirver;

    private String url;

    private String username;

    private String password;

    public String getDriver() {
        return dirver;
    }

    public void setDriver(String dirver) {
        this.dirver = dirver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DbConfig{" +
                "dirver='" + dirver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

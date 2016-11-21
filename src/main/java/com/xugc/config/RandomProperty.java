package com.xugc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/11/21.
 */
@Component
@ConfigurationProperties( prefix = "com.xugc.random")
public class RandomProperty {

    private String value;

    private Integer number;

    private Long bignumer;

    private Integer test1;

    private Integer test2;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getBignumer() {
        return bignumer;
    }

    public void setBignumer(Long bignumer) {
        this.bignumer = bignumer;
    }

    public Integer getTest1() {
        return test1;
    }

    public void setTest1(Integer test1) {
        this.test1 = test1;
    }

    public Integer getTest2() {
        return test2;
    }

    public void setTest2(Integer test2) {
        this.test2 = test2;
    }

    @Override
    public String toString() {
        return "RandomProperty{" +
                "value='" + value + '\'' +
                ", number=" + number +
                ", bignumer=" + bignumer +
                ", test1=" + test1 +
                ", test2=" + test2 +
                '}';
    }
}

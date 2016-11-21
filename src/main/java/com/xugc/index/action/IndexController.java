package com.xugc.index.action;

import com.xugc.config.JdbcConfig;
import com.xugc.config.RandomProperty;
import com.xugc.index.exception.BusinessException;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/11/19.
 */
@Api(value = "首頁")
@RestController
@RequestMapping("/")
public class IndexController {

    @Autowired
    JdbcConfig jdbcConfig;

    @Autowired
    RandomProperty randomProperty;

    @RequestMapping(value = {"", "index"}, method = RequestMethod.GET)
    public String index() {
        return "Hello World!";
    }

    @RequestMapping(value = "jdbc", method = RequestMethod.GET)
    public JdbcConfig jdbcConfig() {
        return this.jdbcConfig;
    }

    @RequestMapping(value = "random",method = RequestMethod.GET)
    public RandomProperty randomProperty(){
        return randomProperty;
    }

    @RequestMapping(value = "json",method = RequestMethod.GET)
    public String json() throws BusinessException{
        throw new BusinessException("业务逻辑错误!");
    }

    @RequestMapping(value = "exception",method = RequestMethod.GET)
    public String error() throws Exception{
        throw new Exception("我的Exception");
    }
}

package com.xugc.config;

import com.xugc.annotation.FuncValid;
import com.xugc.index.exception.BusinessException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;

/**
 *  功能权限验证AOP
 * Created by xuguocheng on 2016/11/23.
 */
@Aspect
@Component
public class FuncValidAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private static Random random = new Random();

    @Pointcut("@annotation(com.xugc.annotation.FuncValid)")
    public void funcValid() {
    }

    @Before(value = "funcValid() && @annotation(fn)")
    public void doBefore(JoinPoint joinPoint,FuncValid fn) throws Throwable {
        logger.debug("验证权限,method:{},code:{},desc:{}",joinPoint.getSignature().toShortString(),Arrays.asList(fn.codes()),fn.desc());
        if(!random.nextBoolean()){
            throw new BusinessException("没有权限.");
        }
    }
}

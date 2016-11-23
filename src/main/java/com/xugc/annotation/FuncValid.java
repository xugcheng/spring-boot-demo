package com.xugc.annotation;

import java.lang.annotation.*;

/**
 * Created by xuguocheng on 2016/11/23.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface FuncValid {

    /**
     * 权限编码
     *
     * @return
     */
    String[] codes() default {};


    /**
     * 权限描述
     *
     * @return
     */
    String desc() default "";

}

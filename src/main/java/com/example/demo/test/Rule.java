package com.example.demo.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p> 加上这个注解，会对该方法的返回值进行扫描规则引擎并执行 </p>
 *
 * <pre> Created: 2019/7/8 15:45 </pre>
 *
 * @author cq
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Rule {

    /**
     * 场景码
     *
     * @return
     */
    String scene();
}

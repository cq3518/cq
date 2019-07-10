package com.example.demo.rote;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p> 注解在接口的实现类上，表示该接口的路由规则 </p>
 *
 * <pre> Created: 2019/5/17 9:17 </pre>
 *
 * @author hlu
 * @version 1.0
 * @since JDK 1.7
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Component
public @interface Rule {

    /**
     * 场景码
     * @return
     */
    String scene();
    /**
     * 场景名称
     */
    String sceneName();
}

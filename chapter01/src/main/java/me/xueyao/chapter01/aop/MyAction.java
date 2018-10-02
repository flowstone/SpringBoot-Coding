package me.xueyao.chapter01.aop;

import java.lang.annotation.*;

/**
 * description: 编写拦截规则的注解
 * author: Simon.Xue
 * date: 2018/10/2
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAction {
    String name();
}

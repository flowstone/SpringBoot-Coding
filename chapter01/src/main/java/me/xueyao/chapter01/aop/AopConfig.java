package me.xueyao.chapter01.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * description:
 * author: Simon.Xue
 * date: 2018/10/2
 **/
@Configuration
@ComponentScan("me.xueyao.chapter01.aop")
@EnableAspectJAutoProxy //开启Spring对AspectJ代理的支持
public class AopConfig {
}

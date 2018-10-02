package me.xueyao.chapter01.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * description: 切面
 * author: Simon.Xue
 * date: 2018/10/2
 **/
@Aspect //注解声明一个切面
@Component  //让此切面成为Spring容器管理的Bean
public class LogAspect {

    @Pointcut("@annotation(me.xueyao.chapter01.aop.MyAction)") //注解声明切点
    public void annotationPointCut(){};

    @After("annotationPointCut()") //声明一个建言，并使用@PointCut定义的切点
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        MyAction myAction = method.getAnnotation(MyAction.class);
        //通过反射可获得注解上的属性，然后做日志记录相关的操作
        System.out.println("注解式拦截 " + myAction.name());
    }

    //声明一个建言，此建言直接使用拦截规则作为参数
    @Before("execution(* me.xueyao.chapter01.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截，" + method.getName());
    }
}

package me.xueyao.chapter01.aop;

import org.springframework.stereotype.Service;



/**
 * description: 使用注解的被拦截类
 * author: Simon.Xue
 * date: 2018/10/2
 **/
@Service
public class DemoAnnotationService {

    @MyAction(name="注解式拦截的add操作")
    public void add(){}
}

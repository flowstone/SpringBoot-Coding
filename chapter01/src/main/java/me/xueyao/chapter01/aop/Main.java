package me.xueyao.chapter01.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * description:
 * author: Simon.Xue
 * date: 2018/10/2
 **/
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}

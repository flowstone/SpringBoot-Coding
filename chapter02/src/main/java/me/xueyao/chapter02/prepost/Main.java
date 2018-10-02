package me.xueyao.chapter02.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * description:
 * author: Simon.Xue
 * date: 2018/10/2
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);

        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);

        context.close();
    }
}

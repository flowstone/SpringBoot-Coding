package me.xueyao.springboot;

import me.xueyao.springboot.config.DiConfig;
import me.xueyao.springboot.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * description:
 * author: Simon.Xue
 * date: 2018/10/2
 **/
public class Main {
    public static void main(String[] args) {
        //使用AnnotationConfigApplicationContext作为Spring容器，接收输入一个配置类为参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        //获得声明配置的UseFunctionService的Bean
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.SayHello("World"));

        context.close();
    }
}

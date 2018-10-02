package me.xueyao.springboot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 * author: Simon.Xue
 * date: 2018/10/2
 **/
@Configuration //声明当前类是配置类
//自动扫描包名下所有使用@Servic、@Component,@Repository,@Controller的类，并注册为Bean
@ComponentScan("me.xueyao.springboot.service")
public class DiConfig {
}

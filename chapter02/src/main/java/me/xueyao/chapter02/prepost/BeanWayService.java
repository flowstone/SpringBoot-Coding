package me.xueyao.chapter02.prepost;

/**
 * description:
 * author: Simon.Xue
 * date: 2018/10/2
 **/
public class BeanWayService {
    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destroy() {
        System.out.println("@Bean-destroy-method");
    }
}

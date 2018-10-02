package me.xueyao.chapter02.event;

import org.springframework.context.ApplicationListener;

/**
 * description:
 * author: Simon.Xue
 * date: 2018/10/2
 **/
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();

        System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息：" + msg);
    }
}

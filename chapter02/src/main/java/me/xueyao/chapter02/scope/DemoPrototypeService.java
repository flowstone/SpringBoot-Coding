package me.xueyao.chapter02.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * description:
 * author: Simon.Xue
 * date: 2018/10/2
 **/
@Service
@Scope("prototype") //声明Scope为Prototype，每次调用生成一个对象
public class DemoPrototypeService {
}

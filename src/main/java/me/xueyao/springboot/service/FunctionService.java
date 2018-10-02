package me.xueyao.springboot.service;

import org.springframework.stereotype.Service;

/**
 * description:
 * author: Simon.Xue
 * date: 2018/10/2
 **/
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + "!";
    }
}

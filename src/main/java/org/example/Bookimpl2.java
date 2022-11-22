package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Bookimpl2 implements Bookint{
    @Override
    public void book() {
        System.out.println("test annotation");
    }
    @PostConstruct
    public void init(){
        System.out.println("before...");
    }
    @PreDestroy
    public void destory(){
        System.out.println("after");
    }
}

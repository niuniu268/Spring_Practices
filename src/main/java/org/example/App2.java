package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Bookconfig.class);
        BookService bean = annotationConfigApplicationContext.getBean(BookService.class);
        bean.bookserive();


    }
}

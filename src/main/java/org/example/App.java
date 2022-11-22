package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml.bak");
        BookService bean = (BookService) context.getBean("bookService");


        bean.bookserive();
    }
}

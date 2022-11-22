package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookService {
    @Autowired
    private Bookimpl2 book;
    @Value("${num}")
    private int num;



    public void bookserive(){
        book.book();
        System.out.println("print out book service");
        System.out.println(num);
    }
}

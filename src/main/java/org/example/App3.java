package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class App3  {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Bookconfig.class);
        DataSource bean = annotationConfigApplicationContext.getBean(DataSource.class);

        System.out.println(bean);
    }
}

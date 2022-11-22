package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:data.properties")
public class Bookconfig {
    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("JDBC:mysql://127.0.0.1:3306/test");
        druidDataSource.setUsername("niuniu");
        druidDataSource.setPassword("louis");
        return druidDataSource;
    }

}

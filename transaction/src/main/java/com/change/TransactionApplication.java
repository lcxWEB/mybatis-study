package com.change;

import com.change.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author: lichunxia
 * @create: 2021-01-27 20:05
 */
@SpringBootApplication
public class TransactionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(TransactionApplication.class, args);

        HelloService helloService = applicationContext.getBean(HelloService.class);
        helloService.select();
    }
}

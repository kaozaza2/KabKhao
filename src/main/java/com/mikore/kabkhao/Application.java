package com.mikore.kabkhao;

import com.mikore.kabkhao.entities.Order;
import com.mikore.kabkhao.services.OrderRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application
{
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(OrderRepository repository) {
        return (args) -> {
            repository.save(new Order("Mama", "blank.jpg", 15.0, false, 0));
            repository.save(new Order("YumYum", "blank.jpg", 18.0, false, 0));
            repository.save(new Order("KrungSri", "blank.jpg", 25.0, false, 0));
        };
    }
}

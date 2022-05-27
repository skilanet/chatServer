package com.samsung;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class Chat {
    public static void main(String[] args) throws SQLException {
        SpringApplication.run(Chat.class, args);
        Console.main(args);
    }
}

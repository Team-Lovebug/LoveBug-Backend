package com.example.lovebug_backend;


// 나는 바보
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})

public class LoveBugBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoveBugBackendApplication.class, args);
    }

}

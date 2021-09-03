package com.zekeriyafince.schoolmanagement;

import com.zekeriyafince.schoolmanagement.utils.InitializerRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SchoolmanagementApplication {


    public static void main(String[] args) {
        SpringApplication.run(SchoolmanagementApplication.class, args);
    }

    @Bean
    public InitializerRunner schedulerRunner(){
        return new InitializerRunner();
    }

}

package com.example.rest.service.crud.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student felipe = new Student(
                    "Felipe augusto",
                    "felipe@gmail.com",
                    LocalDate.of(1996,07,19),
                    25
            );
            Student jane = new Student(
                    "Jane doe",
                    "jane@gmail.com",
                    LocalDate.of(1991,07,19),
                    25
            );
            repository.saveAll(List.of(felipe, jane));
        };
    }
}

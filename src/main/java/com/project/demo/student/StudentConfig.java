package com.project.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.DECEMBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student nahid = new Student(
                    "Nahid",
                    "nahidahsan@gmail.com",
                    LocalDate.of(1996, AUGUST, 29)
                    );

            Student shishir = new Student(
                    "Shishir",
                    "shishir@gmail.com",
                    LocalDate.of(1995, DECEMBER, 5)
            );

            repository.saveAll(
                    List.of(nahid, shishir)
            );

        };
    }
}



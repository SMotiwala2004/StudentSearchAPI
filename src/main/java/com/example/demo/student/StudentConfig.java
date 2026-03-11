package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Safeer = new Student(
                    "Safeer",
                    "motiwala.safeer@gmail.com",
                    LocalDate.of(2004, Month.NOVEMBER, 20)
            );
            Student Alex = new Student(
                    "Alex",
                    "Alex123@gmail.com",
                    LocalDate.of(2002, Month.JANUARY, 9)
            );
            repository.saveAll(List.of(Safeer, Alex));
        };
    }
}

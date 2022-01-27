package com.mekaki.allaney.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JULY;
import static java.util.Calendar.MARCH;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentDAO studentDAO){
        return args -> {
            Student allan=new Student(
                    23,
                    "Allan Limo",
                    LocalDate.of(1997, MARCH,28),
                    "Allanlimo02@gmail.com");
            Student mercy=new Student(
                    23,
                    "Allan Limo",
                    LocalDate.of(1995, JULY,17),
                    "mkagwiria4@gmail.com");
            studentDAO.saveAll(
                    List.of(allan,mercy)
            );


        };
    }
}

package com.example.rest.service.crud.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "Jane doe",
                        "Jane@gmail.com",
                        LocalDate.of(2000,07, 19),
                        25

                )
        );
    }
}

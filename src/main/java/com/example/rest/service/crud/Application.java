package com.example.rest.service.crud;

import com.example.rest.service.crud.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping
	public List<Student> students() {
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

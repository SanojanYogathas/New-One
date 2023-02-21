package com.example.demo.student;
import java.util.List;
import org.springframework.stereotype.Service;
import java.time.LocalDate;


@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "sanojan",
                        "sanojanyogathas@gmail.com",
                        LocalDate.of(1998, 8, 12),
                        25));
    }
}



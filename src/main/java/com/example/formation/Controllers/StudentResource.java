package com.example.formation.Controllers;

import com.example.formation.Models.Student;
import com.example.formation.Services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentResource {

    private final StudentService studentService;

    @GetMapping("/")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("default");
        return modelAndView;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.inMemoryStudents();
    }

    @GetMapping("/student/**")
    public Student getBestStudent() {
        return studentService.bestStudent();
    }
}

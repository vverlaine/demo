package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;
import reactor.core.publisher.Flux;

@Controller
public class StudenListController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/list-students")
    public String listStudents(Model model) {
        Flux<Student> flux = studentRepository.findAll();
        model.addAttribute("students", flux);
        return "students";
    }

    @GetMapping("/list-students-reactive")
    public String listUserReactive(Model model) {
        Flux<Student> userFlux = studentRepository.findAll();
        model.addAttribute("students", new ReactiveDataDriverContextVariable(userFlux, 50));
        return "students";
    }
}

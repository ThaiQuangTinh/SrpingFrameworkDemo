package com.example.springdemo.controllers;

import com.example.springdemo.models.StudentTest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestThymeleafController {

    private final List<StudentTest> studentTestList = new ArrayList<>();

    @GetMapping("/thymeleaf")
    public String testThymeleaf(Model model) {
        StudentTest s1 = new StudentTest("Alice", 20);
        StudentTest s2 = new StudentTest("Yue", 16);

        //Simple Attributes
        model.addAttribute("message", "Welcome Liliana");

        // Collection Attributes
        List<StudentTest> studentTestList = new ArrayList<>();
        studentTestList.add(s1);
        studentTestList.add(s2);
        model.addAttribute("students", studentTestList);

        // Conditional Evaluation
        model.addAttribute("student1", s1);
        model.addAttribute("student2", s2);

        model.addAttribute("student3", new StudentTest());

        return "thymeleaf";
    }

    @PostMapping("/saveStudentData")
    public void saveStudentData(Model model, @ModelAttribute("student3") StudentTest student3) {
        studentTestList.add(student3);

        for (StudentTest s : studentTestList) {
            System.out.println("Name: " + s.getName() + ", Age: " + s.getAge());
        }
    }

}

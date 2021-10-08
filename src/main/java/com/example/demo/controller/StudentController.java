package com.example.demo.controller;

import com.example.demo.Service.IStudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController {

    @Resource(name="StudentService")
    private IStudentService studentService;

    @GetMapping("hello")
    public String getStudent(){
        return studentService.getAllStudent().toString();
    }
}

package com.example.demo.Service.impl;

import com.example.demo.Service.IStudentService;
import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "StudentService")
public class StudentService implements IStudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getAllStudent() {
        return studentDao.getAllStudent();
    }
}

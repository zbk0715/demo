package com.example.demo.dao;


import com.example.demo.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentDao {
List<Student> getAllStudent();
}

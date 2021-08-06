package com.example.springboot_jdbc.controller;

import com.example.springboot_jdbc.mapper.StudentMapper;
import com.example.springboot_jdbc.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    StudentMapper mapper;

    @GetMapping("/userList")
    public List<Map<String,Object>> userList(){
        List<Map<String,Object>> stuList = jdbcTemplate.queryForList("select * from student");
        System.out.println("test");
        return stuList;
    }

    @GetMapping("/userList1")
    public List<Student> userList1(){
        List<Student> stuList = mapper.queryStuList();
        return stuList;
    }
}

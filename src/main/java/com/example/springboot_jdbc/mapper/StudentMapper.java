package com.example.springboot_jdbc.mapper;

import com.example.springboot_jdbc.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//这个注解表示了这是一个mybatis的mapper类
@Mapper
@Repository
public interface StudentMapper {
    List<Student> queryStuList();
    Student queryStu(String name);
    int addStu(Student student);
    int updateStu(Student student);
    int deleteStu(String name);
}

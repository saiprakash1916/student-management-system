package com.studentManagement.service.impl;

import com.studentManagement.dto.StudentRequestDTO;
import com.studentManagement.entity.Student;

import java.util.List;

public interface StudentServiceImpl {

    Student createStudent(StudentRequestDTO studentRequestDTO);

    Student getStudentById(Long id);

    List<Student> getAllStudent();

    Student updateStudent(Long id, StudentRequestDTO studentRequestDTO);

    Student deleteStudent(Long id);
}

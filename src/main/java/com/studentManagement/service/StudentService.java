package com.studentManagement.service;

import com.studentManagement.dto.StudentRequestDTO;
import com.studentManagement.entity.Student;

import java.util.List;

public interface StudentService {

    Student createStudent(StudentRequestDTO studentRequestDTO);

    Student getStudentById(Long id);

    List<Student> getAllStudent();

    Student updateStudent(Long id, StudentRequestDTO studentRequestDTO);

    void deleteStudent(Long id);

}

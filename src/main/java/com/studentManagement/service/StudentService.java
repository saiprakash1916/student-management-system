package com.studentManagement.service;

import com.studentManagement.dto.StudentRequestDTO;
import com.studentManagement.entity.Student;
import com.studentManagement.repository.StudentRepository;
import com.studentManagement.service.impl.StudentServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentServiceImpl {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student createStudent(StudentRequestDTO studentRequestDTO) {
        return null;
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }

    @Override
    public List<Student> getAllStudent() {
        return List.of();
    }

    @Override
    public Student updateStudent(Long id, StudentRequestDTO studentRequestDTO) {
        return null;
    }

    @Override
    public Student deleteStudent(Long id) {
        return null;
    }
}

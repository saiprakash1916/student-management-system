package com.studentManagement.service.impl;

import com.studentManagement.dto.StudentRequestDTO;
import com.studentManagement.entity.Student;
import com.studentManagement.exception.StudentNotFoundException;
import com.studentManagement.repository.StudentRepository;
import com.studentManagement.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student createStudent(StudentRequestDTO studentRequestDTO) {
        Student student = new Student(
                studentRequestDTO.getName(),
                studentRequestDTO.getEmail(),
                studentRequestDTO.getAge(),
                studentRequestDTO.getDepartment()
        );
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found with id " + id));
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Long id, StudentRequestDTO studentRequestDTO) {
        Student student = getStudentById(id);

        student.setName(studentRequestDTO.getName());
        student.setEmail(studentRequestDTO.getEmail());
        student.setAge(studentRequestDTO.getAge());
        student.setDepartment(studentRequestDTO.getDepartment());

        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        Student student = getStudentById(id);
        studentRepository.delete(student);
    }
}

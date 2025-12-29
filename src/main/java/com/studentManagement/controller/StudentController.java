package com.studentManagement.controller;

import com.studentManagement.dto.StudentRequestDTO;
import com.studentManagement.entity.Student;
import com.studentManagement.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@Valid @RequestBody StudentRequestDTO studentRequestDTO){
        return studentService.createStudent(studentRequestDTO);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @Valid @RequestBody StudentRequestDTO studentRequestDTO){
        return studentService.updateStudent(id, studentRequestDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}

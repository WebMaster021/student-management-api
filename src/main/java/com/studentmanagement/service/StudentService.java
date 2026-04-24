package com.studentmanagement.service;

import com.studentmanagement.modal.Student;
import com.studentmanagement.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(UUID id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public Student updateStudent(UUID id, Student student) {
        Student stu = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        stu.setName(student.getName());
        stu.setEmail(student.getEmail());
        stu.setAge(student.getAge());
        stu.setGrade(student.getGrade());

        return studentRepository.save(stu);
    }

    public void deleteStudent(UUID id) {
        studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        studentRepository.deleteById(id);
    }

    public List<Student> searchByName(String name) {
        return studentRepository.findByName(name);
    }

    public List<Student> filterByGrade(String grade) {
        return studentRepository.findByGrade(grade);
    }
}

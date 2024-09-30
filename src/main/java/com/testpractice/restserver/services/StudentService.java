package com.testpractice.restserver.services;

import com.testpractice.restserver.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testpractice.restserver.repositories.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudentsByGroupOrderByFullName(String group) {

        return studentRepository.findAllByGroupOrderByFullName(group);
    }

    public List<Student> getStudentsByGroupOrderByGender(String group) {

        return studentRepository.findAllByGroupOrderByGender(group);
    }

    public List<Student> getStudentsByGroupOrderByStatus(String group) {

        return studentRepository.findAllByGroupOrderByStatus(group);
    }

    public List<Student> getStudentsByGroupOrderByTypeOfFinancing(String group) {

        return studentRepository.findAllByGroupOrderByTypeOfFinancing(group);
    }

    public List<Student> getAllStudentsOrderByCourse() {
        return studentRepository.findAllByOrderByCourse();
    }

}
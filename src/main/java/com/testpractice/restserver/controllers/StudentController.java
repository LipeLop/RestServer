package com.testpractice.restserver.controllers;

import com.testpractice.restserver.entities.Student;
import com.testpractice.restserver.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);


    @GetMapping
    public List<Student> getAllStudentsByOrderByCourse() {
        logger.info("StudentController: getAllStudentsByOrderByCourse");
        return studentService.getAllStudentsOrderByCourse();
    }

    @GetMapping("/fullname")
    public List<Student> getStudentsByGroupOrderByFullName(@RequestParam String group) {
        logger.info("StudentController: getStudentsByGroupOrderByFullName");
        return studentService.getStudentsByGroupOrderByFullName(group);
    }

    @GetMapping("/gender")
    public List<Student> getStudentsByGroupOrderByGender(@RequestParam String group) {
        logger.info("StudentController: getStudentsByGroupOrderByGender");
        return studentService.getStudentsByGroupOrderByGender(group);
    }

    @GetMapping("/status")
    public List<Student> getStudentsByGroupOrderByStatus(@RequestParam String group) {
        logger.info("StudentController: getStudentsByGroupOrderByStatus");
        return studentService.getStudentsByGroupOrderByStatus(group);
    }

    @GetMapping("/tof")
    public List<Student> getStudentsByGroupOrderByTypeOfFinancing(@RequestParam(required = false) String group) {
        logger.info("StudentController: getStudentsByGroupOrderByTypeOfFinancing");
        return studentService.getStudentsByGroupOrderByTypeOfFinancing(group);
    }
}
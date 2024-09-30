package com.testpractice.restserver.repositories;


import com.testpractice.restserver.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAllByGroupOrderByFullName(String groupNumber);
    List<Student> findAllByGroupOrderByGender(String groupNumber);
    List<Student> findAllByGroupOrderByStatus(String groupNumber);
    List<Student> findAllByGroupOrderByTypeOfFinancing(String groupNumber);
    List<Student> findAllByOrderByCourse();
}
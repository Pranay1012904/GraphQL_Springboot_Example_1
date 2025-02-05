package com.example.graphQL2.service.impl;

import com.example.graphQL2.entity.Student;
import com.example.graphQL2.repository.StudentRepository;
import com.example.graphQL2.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    /*QUERY FOR JPA DATA FETCHING IN GRAPHQL
    query{
  getStudent(id:1){
    city
    email
    fName
    id
    lName
    state
    listOfSubjects{
      id
      marksObtained
      subjectName
    }
  }
}
    * */
    @Override
    public Student getStudentById(Long id) {
          Optional<Student> std = studentRepository.findById(id);
        return std.get();
    }
}

package com.example.graphQL2.custom_student_response;

import com.example.graphQL2.entity.Student;
import com.example.graphQL2.entity.Subject;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class StudentResponse {
    private Long id;

    private String fName;

    private String lName;

    private String email;

    private String city;

    private String state;

    List<SubjectResponse> listOfSubjects;

    public StudentResponse(Student student) {
        this.id = student.getId();
        this.fName = student.getfName();
        this.lName = student.getlName();
        this.email = student.getEmail();
        this.city = student.getAddress().getCity();
        this.state = student.getAddress().getState();
        //this part will be replaced when we implement graphQL resolver!
        if(student.getListOfSubjects()!=null){
            listOfSubjects=new ArrayList<>();
            for(Subject subject: student.getListOfSubjects()){
                listOfSubjects.add(new SubjectResponse(subject));
            }
        }
    }
}

package com.example.graphQL2.Query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphQL2.custom_student_response.StudentResponse;
import com.example.graphQL2.entity.Student;
import com.example.graphQL2.model.SampleRequest;
import com.example.graphQL2.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@Controller
@AllArgsConstructor
public class Query{
    @Autowired
    private StudentService studentService;

    @QueryMapping
    public String firstQuery(){
        return " MY First Query";
    }

    @QueryMapping
    public String secondQuery(){
        return "My Second Query";
    }
    @QueryMapping
    public String fullName(@Argument String fName,@Argument String lName){
        return fName+" "+lName;
    }

    @QueryMapping
    public String jsonFullName(@Argument SampleRequest sampleRequest){
        return "FullName::"+sampleRequest.getfName()+" "+sampleRequest.getlName();
    }

    @QueryMapping
    public StudentResponse getStudent(@Argument Long id){
      Student fetchedStd= studentService.getStudentById(id);
      return new StudentResponse(fetchedStd);
    }
}

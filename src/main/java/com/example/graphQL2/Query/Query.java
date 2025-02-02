package com.example.graphQL2.Query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@Controller
public class Query {

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
}

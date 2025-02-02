package com.example.graphQL2.model;

import lombok.*;
import org.springframework.stereotype.Component;


public class SampleRequest {
    private String fName;
    private String lName;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}

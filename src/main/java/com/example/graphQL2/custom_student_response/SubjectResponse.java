package com.example.graphQL2.custom_student_response;

import com.example.graphQL2.entity.Subject;
import lombok.Data;

@Data
public class SubjectResponse {

    private long id;
    private String subjectName;
    private int marksObtained;

    public SubjectResponse(Subject subject) {
        this.id = subject.getId();
        this.subjectName= subject.getSubject_name();
        this.marksObtained=subject.getMarks_obtained();
    }
}

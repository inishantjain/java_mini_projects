package com.nishant.jpademo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//these lombok annotations helps to reduce number of lines of code, we don't need to explicitly create constructors, getters and setters here

@Component
@Scope("prototype")
@Entity // creates table from a class
public class Student {
    @Id
    private int rollNo;
    private int marks;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Student name=%s, rollNo=%d, marks=%d", name, rollNo, marks);
    }

}

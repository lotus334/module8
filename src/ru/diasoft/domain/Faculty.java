package ru.diasoft.domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    @Getter
    private List<Student> studentsList = new ArrayList<>();

    public void addStudent(Student student) {
        studentsList.add(student);
    }
}

package ru.diasoft.domain;

import lombok.Getter;

import java.util.*;

public class Faculty {
    @Getter
    private Set<Student> studentsList = new TreeSet<>();

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public void addStudents(Student ... students) {
        studentsList.addAll(Arrays.asList(students));
    }
}

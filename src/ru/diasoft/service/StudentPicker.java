package ru.diasoft.service;

import ru.diasoft.domain.Student;

import java.util.Set;

public interface StudentPicker {

    Set<Student> findByFirstName(String name);

    Set<Student> getSortedBySecondName();

    Set<Student> getExcellentStudents();
}

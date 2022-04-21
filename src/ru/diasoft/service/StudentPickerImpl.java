package ru.diasoft.service;

import ru.diasoft.domain.Faculty;
import ru.diasoft.domain.Student;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentPickerImpl implements StudentPicker {

    private Set<Student> studentsList;

    public StudentPickerImpl(Faculty faculty) {
        this.studentsList = faculty.getStudentsList();
    }

    @Override
    public Set<Student> findByFirstName(String name) {
        return studentsList.stream()
                .filter(student -> name.equals(student.getFirstName()))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Student> getSortedBySecondName() {
        return studentsList.stream()
                .sorted((o1, o2) -> Comparator.comparing(Student::getSecondName).compare(o1, o2))
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    @Override
    public Set<Student> getExcellentStudents() {
        return studentsList.stream()
                .filter(student -> student.getScore() == 5)
                .collect(Collectors.toSet());
    }
}

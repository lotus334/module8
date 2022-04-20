package ru.diasoft.service;

import ru.diasoft.domain.Student;

public class StudentPrinter implements Printer<Student> {

    @Override
    public void printInfo(Student p) {
        System.out.println(p);
    }
}

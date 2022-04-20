package ru.diasoft.service;

import ru.diasoft.domain.Person;
import ru.diasoft.domain.Student;

public class PersonDemo {
    private Person person;
    private Student student;

    public PersonDemo() throws Exception {
        person = new Person("Ivan", "Ivanov", 35, 88005553555L);
        student = new Student("Student", "Otlichnik", 17, 87772223555L);
    }

    public void demo() {
        Printer personPrinter = new PersonPrinter();
        personPrinter.printInfo(person);

        Printer studentPrinter = new StudentPrinter();
        student.setGroup("224");
        student.setScore(5.5f);
        studentPrinter.printInfo(student);
    }
}
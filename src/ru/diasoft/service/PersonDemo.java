package ru.diasoft.service;

import ru.diasoft.domain.Person;
import ru.diasoft.domain.Student;
import ru.diasoft.repository.StudentRepository;

public class PersonDemo {
    private Person person;
    private Student student;
    private StudentRepository studentRepository;

    public PersonDemo() {
        person = new Person("Ivan", "Ivanov", 35, 88005553555L);
        student = new Student("Student", "Otlichnik", 25, 87772223555L);
        studentRepository = new StudentRepository();
    }

    public void demo() {
        Printer<Person> personPrinter = new PersonPrinter();
        personPrinter.printInfo(person);

        Printer<Student> studentPrinter = new StudentPrinter();
        student.setGroup("224");
        student.setScore(5.5f);
        studentPrinter.printInfo(student);
    }

    public void facultyDemo() {
        studentRepository.getFaculty().getStudentsList().forEach(System.out::println);
    }
}
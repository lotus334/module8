package ru.diasoft.service;

import ru.diasoft.domain.Faculty;
import ru.diasoft.domain.Person;
import ru.diasoft.domain.Student;
import ru.diasoft.repository.StudentRepository;

import java.util.Set;
import java.util.function.Consumer;

public class PersonDemo {
    private Person person;
    private Student student;
    private StudentRepository studentRepository;
    private Faculty faculty;

    public PersonDemo() {
        person = new Person("Ivan", "Ivanov", 35, 88005553555L);
        student = new Student("Student", "Otlichnik", 25, 87772223555L);
        studentRepository = new StudentRepository();
        faculty = studentRepository.getFaculty();
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
        faculty.getStudentsList().forEach(System.out::println);
    }

    public void studentPickerDemo() {
        StudentPicker studentPicker = new StudentPickerImpl(faculty);

        String name = "Genya";
        System.out.println("Try to find " + name + ":");
        Set<Student> genyas = studentPicker.findByFirstName(name);
        genyas.forEach(student -> System.out.println(student.getFirstName() + " " + student.getSecondName() + " " + student.getAge()));

        System.out.println("\n");
        System.out.println("Try to sort by second name:");
        Set<Student> sortedStudents = studentPicker.getSortedBySecondName();
        sortedStudents.forEach(student -> System.out.println(student.getSecondName() + " " + student.getFirstName()));

        System.out.println("\n");
        System.out.println("Try to find excellent students:");
        Set<Student> excellentStudents = studentPicker.getExcellentStudents();
        excellentStudents.forEach(student -> System.out.println(student.getFirstName() + " " + student.getSecondName() + " " + student.getScore()));
    }
}
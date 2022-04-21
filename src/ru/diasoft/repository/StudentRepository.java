package ru.diasoft.repository;

import lombok.Getter;
import ru.diasoft.domain.Faculty;
import ru.diasoft.domain.Student;

public class StudentRepository {
    @Getter
    private Faculty faculty = new Faculty();

    public StudentRepository() {
        Student student1 = new Student("Ivan", "Ivanov", 25, 87772223555L);
        student1.addCourse("Russian", 3);
        student1.addCourse("English", 5);
        Student student2 = new Student("Fedor", "Fedorov", 35, 87772223444L);
        student2.addCourse("Russian", 4);
        student2.addCourse("English", 4);
        Student student3 = new Student("Masha", "Mashina", 17, 87772223333L);
        student3.addCourse("Russian", 5);
        student3.addCourse("English", 5);
        Student student4 = new Student("Petya", "Petin", 24, 87772223222L);
        student4.addCourse("Russian", 4);
        student4.addCourse("English", 4);
        Student student5 = new Student("Genya", "Genko", 20, 87772223111L);
        student5.addCourse("Russian", 2);
        student5.addCourse("English", 5);
        Student student6 = new Student("Genya", "Genko", 22, 87772223111L);
        student6.addCourse("Russian", 5);
        student6.addCourse("English", 5);
        Student student7 = new Student("Petya", "Petin", 24, 87772223000L);
        faculty.addStudents(student1, student2, student3, student4, student5, student6, student7);
    }
}

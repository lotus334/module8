package ru.diasoft.domain;

import lombok.*;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

@ToString(callSuper = true)
public class Student extends Person implements Comparable<Student> {
    @Getter
    @Setter
    private String group;

    @Getter
    @Setter
    private float score;

    @Getter
    private Map<String, Integer> courses = new TreeMap<>((o1, o2) -> o2.compareTo(o1));

    public Student(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    public Student(String firstName, String secondName, int age, long phone) {
        super(firstName, secondName, age, phone);
    }

    public void addCourse(String courseName, int courseScore) {
        courses.put(courseName, courseScore);
        float score = (float)courses.values().stream().reduce(Integer::sum).get() / courses.size();
        setScore(score);
    }

    @Override
    public int compareTo(Student o) {
        return Comparator.comparing(Student::getSecondName)
                .thenComparing(Student::getFirstName)
                .thenComparingInt(Student::getAge)
                .compare(this, o);
    }
}
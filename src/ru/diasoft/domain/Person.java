package ru.diasoft.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Person {

    @Getter
    private String firstName;

    @Getter
    private String secondName;

    @Getter
    @Setter
    private int age;

    @Getter
    @Setter
    private long phone;

    public Person(@NonNull String firstName,@NonNull String secondName, int age, long phone) {
        this(firstName, secondName, age);
        this.phone = phone;
    }

    public Person(@NonNull String firstName,@NonNull String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }
}
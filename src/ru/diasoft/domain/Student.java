package ru.diasoft.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
public class Student extends Person {
    @Getter
    @Setter
    String group;

    @Getter
    @Setter
    float score;

    public Student(@NonNull String firstName, @NonNull String secondName, int age, long phone) throws Exception {
        super(firstName, secondName, age, phone);
    }

    public Student(@NonNull String firstName, @NonNull String secondName, int age) throws Exception {
        super(firstName, secondName, age);
    }
}
